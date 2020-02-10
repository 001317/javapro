package com.neuedu.homework1;

public class Rectangle extends Shape {
    public double width;
    public double height;
     public Rectangle(){}
     public Rectangle(double height,double width,String color){
         super();
         this.height=height;
         this.width=width;
         this.color=color;
     }
    @Override
    public void getPer() {
       per = (width+height)*2;
       System.out.println(per);
    }

    @Override
    public void getArea() {
       area = width*height;
        System.out.println(area);
    }

    @Override
    public void showAll() {
        System.out.print("矩形周长为"+" ");
        getPer();
        System.out.print("矩形面积为"+" ");
        getArea();
        System.out.println("矩形颜色为"+color);

    }
}
