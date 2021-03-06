package model;

import java.util.List;

public class Product {
    private int id;
    private int quantity;
    private double price;
    private String name;
    private String category;
    private String image;
    private List<String> colors;
    private boolean isNew;
    private int weight;
    private int size;

    public Product() {
    }

    public Product(int id, int quantity, double price, String name, String category) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public Product(int id, int quantity, double price, String name, String category, String image, boolean isNew) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.category = category;
        this.image = image;
        this.isNew = isNew;
    }

    public Product(int id, int quantity, double price, String name, String category, String image, List<String> colors, boolean isNew, int weight, int size) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.category = category;
        this.image = image;
        this.colors = colors;
        this.isNew = isNew;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
