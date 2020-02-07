package com.example.lab4participation;



public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int x, int y, int length, int width){
        super(x, y);
        this.length = length;
        this.width = width;
    }
    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
}


