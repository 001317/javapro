package com.neuedu.test;

public class OddSum {
    public static int Sum(int a,int b){
        int sum = 0;
        for(int i = a;i<=b;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
}
