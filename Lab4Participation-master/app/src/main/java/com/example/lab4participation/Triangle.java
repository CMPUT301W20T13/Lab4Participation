package com.example.lab4participation;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;
    private Triangle(int x, int y, int a, int b, int c){
        super(x,y);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
