package com.neuedu.homework0213;

/*
* 一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后 反弹多高
* */
public class Test2 {
    public static void main(String[] args) {
       float h = 100;
       for(int i = 0;i<10;i++){
           h = h/2;
       }
       System.out.println(h);
    }
}
