package com.neuedu.homework0213;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(method(5));
    }
    public static int method(int n){
        int f1 =1;
        int f2 =2;
        int sum = 0;
        if(n==1||n==2){
            return 1;
        }else{
            for(int i=3;i<=n;i++){
                sum=f1+f2;
                f1=f2;
                f2=sum;
            }
            return f2;
        }
    }
}
