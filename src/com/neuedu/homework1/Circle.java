package com.neuedu.homework1;

public class Circle extends Shape{
    public double radius;
    public Circle(String color,double radius){
        this.color=color;
        this.radius=radius;
    }
    @Override
    public void getPer() {
       per = 2* 3.14 *radius;
       //System.out.println(per);
    }

    @Override
    public void getArea() {
       area = 3.14*radius*radius;
        //System.out.println(area);
    }

    @Override
    public void showAll() {
        System.out.println(per);
//        System.out.print("圆周长为"+" ");
//        getPer();
//        System.out.print("圆面积为"+" ");
//        getArea();
//        System.out.println("矩形颜色为"+color);
    }
}
