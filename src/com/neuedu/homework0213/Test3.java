package com.neuedu.homework0213;
/*
* 一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少
* */
public class Test3 {
    public static void main(String[] args) {
        double num = -100;
        while(true){
            double a = Math.sqrt(num+100);
            double b = Math.sqrt(num+168+100);
            if(a==(int)a&&b==(int)b){
                System.out.println(num);
            }
            num++;
        }
    }
}
