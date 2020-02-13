package com.neuedu.homework0213;

/*
* 输出斐波那契数列  以 1 1 开头 后面每一位都是前两位之和
    * 1 1 2 3 5 8 13
* */
public class Fs {
    public static void main(String[] args) {
        method(10);
    }
    public static void method(int n){
            int f1 = 1;
            int f2 = 1;
            int sum;
            for (int i = 2; i <= n; i++) {
                sum = f1 + f2;
//                if(f1>10){
//                    break;
//                }else{
//                    System.out.println(f1);
//                }
                while(f1<10){
                    System.out.println(f1);
                   break;
                }
                f1=f2;
                f2=sum;
            }
    }
}
