package model;

import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

public class ProductForm {
    private int id;
    private int quantity;
    private double price;
    private String name;
    private String category;
    private MultipartFile file;
    private List<String> colors;
    private boolean isNew;
    private int weight;
    private int size;

    public ProductForm() {
        this.colors = new ArrayList<>();
    }

    public ProductForm(int quantity, double price, String name, String category, MultipartFile file, boolean isNew) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.category = category;
        this.file = file;
        this.isNew = isNew;
    }

    public ProductForm(int id, int quantity, double price, String name, String category, MultipartFile file) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.category = category;
        this.file = file;
    }

    public ProductForm(int quantity, double price, String name, String category, MultipartFile file, List<String> colors, int weight, int size) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.category = category;
        this.file = file;
        this.colors = colors;
        this.weight = weight;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
