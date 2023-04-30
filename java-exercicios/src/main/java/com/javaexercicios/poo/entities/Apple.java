package com.javaexercicios.poo.entities;

public class Apple {

    private String color;
    private String flavour;
    private String price;


    public Apple() {
    }

    public Apple(String color, String flavour, String price) {
        this.color = color;
        this.flavour = flavour;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
