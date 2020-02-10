package com.neuedu.test;

public class Narcissus {
    public static void main(String[] args){
//        int a1,a2,a3;
//           for(int i = 100;i<=999;i++){
//               a1 = i/100;
//               a2 = i%10;
//               a3 = i/10%10;
//              int b = (int) (Math.pow(a1,3)+Math.pow(a2,3)+Math.pow(a3,3));
//              if (i==b) System.out.println(i);
//           }
        int a,b,c;
        for(int i =100;i<=999;i++){
            a = i/100;
            b = i%100/10;
            c = i%100%10;
            if(i == a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }
}
