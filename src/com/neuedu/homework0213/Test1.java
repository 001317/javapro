package com.neuedu.homework0213;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
* n个人围坐在一个圈子里 从1开始报数 报到3的时候 离开
*  最后剩下的是第几个人
* */
public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入围坐人数");
        int num = input.nextInt();
        System.out.println(call(num,3));
        System.out.println(call(num));

    }
    public static int call(int people, int num) {
        int r = 0;
        for (int i = 2; i <= people; i++)
            r = (r + num) % i;
        return r + 1;
    }


   public static int call(int n) {
       List<Integer> list = new ArrayList<>();
       for (int i = 1; i <= n; i++) {
           list.add(i);
       }
        int m=1;
       while(list.size()>1){
           if(m!=3){
               int first = list.remove(0);
               list.add(first);
               m++;
           }else{
               list.remove(0);
               m=1;
           }

       }
       return list.get(0);
   }}

