package com.neuedu.homework1;

public abstract class Shape {
    public double area = 0.0;
    public double per = 0.0;
    public String color;
    public Shape(){}
    public Shape(String color){
        this.color=color;
    }
    public abstract void getArea();
    public abstract void getPer();
    public abstract void showAll();
}
