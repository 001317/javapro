package com.neuedu.homework1;

public class Sushu {
    public static void main(String[] args) {
        boolean flag;
        int num =0;
       for(int i = 101;i<=200;i++){
           flag = true;
           for(int j = 2;j<i;j++){
               if(i%j==0){
                   flag = false;
               }
           }
           if(flag){
               num++;
               System.out.println(i);
           }
       }
        System.out.println("素数的个数为"+num);
    }
}
