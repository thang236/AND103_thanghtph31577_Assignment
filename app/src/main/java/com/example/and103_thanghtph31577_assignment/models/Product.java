package com.example.and103_thanghtph31577_assignment.models;

public class Product {
    private String _id;
    private String name;
    private String description;
    private String price;
    private String image;

    public Product(String _id, String name, String description, String price, String image) {
        this._id = _id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public Product() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
