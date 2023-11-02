package com.example.vine_menu_0_0_1.model;

public class Products {
    int id;
    String img, title, percentOfAlcohol, priceOfBottle, color;

    public Products(int id, String img, String title, String percentOfAlcohol, String priceOfBottle, String color) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.percentOfAlcohol = percentOfAlcohol;
        this.priceOfBottle = priceOfBottle;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPercentOfAlcohol() {
        return percentOfAlcohol;
    }

    public void setPercentOfAlcohol(String percentOfAlcohol) {
        this.percentOfAlcohol = percentOfAlcohol;
    }

    public String getPriceOfBottle() {
        return priceOfBottle;
    }

    public void setPriceOfBottle(String priceOfBottle) {
        this.priceOfBottle = priceOfBottle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
