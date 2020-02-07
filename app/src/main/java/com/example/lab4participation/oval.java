package com.example.lab4participation;

public class oval extends Shape {

    private String colour;
    private int area;

    public oval(String colour, int area) {
        super(1, 1);
        this.area = area;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
