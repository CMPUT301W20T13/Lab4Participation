package com.example.lab4participation;

public class Star extends Shape {
    private String color;

    public Star(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }
}
