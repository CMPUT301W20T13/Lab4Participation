package com.example.lab4participation;

public class Circle extends Shape {
    private float radius = 10;

    public Circle(int x, int y, float radius){
        super(x,y);
        this.radius = radius;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }
}
