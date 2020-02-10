package com.neuedu.homework1;

public class Test22 {
    public static void main(String[] args) {
        //2/1,3/2,5/3......
        double sum = 0.0,a=2,b=1,c=0;
        for(int i =0;i<20;i++){
            sum+=a/b;
            c=a;
            a+=b;
            b=c;
        }
        System.out.println(sum);
    }
}
