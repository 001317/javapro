package com.neuedu.test;

public class MyTest9 {
    public static void main(String[] args) {
//        String a = "abc";
//        method(a);
//        System.out.println(a);

        StringBuffer buffer = new StringBuffer("a");
        buffer.append("b");
        buffer.append("c");
        System.out.println(buffer.toString());
    }
    public static void method(String a){
        a="efg";
    }
}
