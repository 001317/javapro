package com.neuedu.bean;

public class MySub implements MyInterface{
    @Override
    public int method(int a, int b) {
        return a-b;
    }
}
