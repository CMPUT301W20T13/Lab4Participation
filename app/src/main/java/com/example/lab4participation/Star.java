package com.example.lab4participation;

public class Star extends Shape {
    private String color;

    public Star(String color) {
        super(0, 0);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }
}
