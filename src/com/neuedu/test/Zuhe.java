package com.neuedu.test;

public class Zuhe {
    public static void zuhe(){
        int d = 0;
        int[] array = {1,2,3,6};
        for(int a:array){
            for(int b:array){
                for(int c:array){
                    if (a != b && a != c && b != c) {
                        d++;
                       int num = a*100+b*10+c;
                        System.out.println(num);
                    }
                    }
                }

                }
        System.out.println(d+"个");
            }
        }



