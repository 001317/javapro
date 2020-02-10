package com.neuedu.test;

import static java.lang.System.*;

public class Year {
    public static  void main(String[] args){
    int year = 2020;
    if((year%4==0&&year%100!=0)|| year%400==0){
        out.println("是闰年");
    }else{
        out.println("不是闰年");
    }
    }
}
