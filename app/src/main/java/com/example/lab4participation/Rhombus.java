package com.example.lab4participation;

public class Rhombus extends Shape{
    private int side;

    public Rhombus(int x,int y,int side){
        super(x,y);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
