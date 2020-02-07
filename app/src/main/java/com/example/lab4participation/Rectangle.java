package com.example.lab4participation;

public class Rectangle extends Shape {
  private String color;

  private int height;
  private int width;

  public Recatangle(int x, int y , int height, int width){
    super(x,y);
    this.height = height;
    this.width = width;
  }
}
