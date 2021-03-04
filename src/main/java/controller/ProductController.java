package controller;

import model.Color;
import model.Product;
import model.ProductForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import service.ColorService;
import service.IColorService;
import service.IProductService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;
    @Autowired
    private IColorService colorService;
    @Autowired
    private Environment environment;

    @ModelAttribute("colorsList")
    private List<Color> getAllColor() {
        return colorService.getAll();
    }

    @ModelAttribute("weights")
    private List<Integer> getAllWeight() {
        return new ArrayList<>(Arrays.asList(1, 2, 3));
    }

    @ModelAttribute("sizes")
    private List<Integer> getAllSize() {
        return new ArrayList<>(Arrays.asList(1, 2, 3));
    }

    @GetMapping("/all")
    public ModelAndView showIndexPage() {
        return new ModelAndView("index", "products", productService.getAll());
    }

    @GetMapping("/create")
    public ModelAndView showCreatePate() {
        return new ModelAndView("create", "product", new ProductForm());
    }

    @PostMapping("/create")
    public ModelAndView create(String[] colors, @ModelAttribute("product") ProductForm productForm, @ModelAttribute("isNew") String isNew) throws IOException {
        /*productForm.setColors(Arrays.asList(colors));*/
        productForm.setId(productService.getAll().size());
        productForm.setNew(isNew.equals("on"));
        System.out.println(productForm.isNew());
        productService.add(new Product(productForm.getId(), productForm.getQuantity(), productForm.getPrice(), productForm.getName(), productForm.getCategory(), productForm.getFile().getOriginalFilename(), productForm.getColors(), productForm.isNew(), productForm.getWeight(), productForm.getSize()));
        //add file to image directory
        String imageSourcePath = environment.getProperty("file_upload").toString();
        FileCopyUtils.copy(productForm.getFile().getBytes(), new File(imageSourcePath + productForm.getFile().getOriginalFilename()));
        /*---------------------------------------------------------------------------*/
        return new ModelAndView("redirect:/products/all");
    }

    @GetMapping("/update/{id}")
    public ModelAndView showUpdatePage(@PathVariable int id) {
        return new ModelAndView("create", "product", productService.getById(id));
    }
}
