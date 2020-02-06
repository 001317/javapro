package com.neuedu.test;


import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        Date startarray = new Date();
        for(int i = 0;i<=100000;i++){
            arrayList.add(0,i);
        }
        Date endarray = new Date();

        Date startlinked = new Date();
        for(int i = 0;i<=100000;i++){
            linkedList.add(0,i);
        }
        Date endlinked = new Date();
        System.out.println("ArrayList插入数据需要的时间"+(endarray.getTime()-startarray.getTime()));
        System.out.println("LinkedList插入数据需要的时间"+(endlinked.getTime()-startlinked.getTime()));

        Date startreadarray = new Date();
        for(int i = 0;i<arrayList.size();i++){
            Object obj = arrayList.get(i);
        }
        Date endreadarray = new Date();
        System.out.println("ArrayList读取用时"+(endreadarray.getTime()-startarray.getTime()));

        Date startredLinked = new Date();
        for(int i = 0;i<linkedList.size();i++){
            Object obj = linkedList.get(i);
        }
        Date endreadlinked = new Date();
        System.out.println("linkedlist的读取时间为"+(endreadlinked.getTime()-startredLinked.getTime()));
    }
}
