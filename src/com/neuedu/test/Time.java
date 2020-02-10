package com.neuedu.test;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
public class Time {

        List arrayList ;
        List linkedList ;
        public void aTime(){
            Date startDate = new Date();
            for (int i = 0;i < 100000000;i++){
                arrayList = new ArrayList();
                arrayList.add(i);
            }
            Date endDate = new Date();
            System.out.println("ArrayLisst添加元素耗时:"+(endDate.getTime()-startDate.getTime())+"ms");
        }
        public void ltime(){
            Date startDate = new Date();
            for (int i = 0;i < 100000000;i++){
                linkedList = new LinkedList();
                linkedList.add(i);
            }
            Date endDate = new Date();
            System.out.println("LinkedList添加元素耗时:"+(endDate.getTime()-startDate.getTime())+"ms");
        }
        public void indexATime(){
            Date startDate = new Date();
            for (int i = 0;i < 100000000;i++){
                arrayList = new LinkedList();
                arrayList.add(0,i);
                System.out.println(arrayList);
            }
            Date endDate = new Date();
            System.out.println("ArrayList中间添加元素耗时:"+(endDate.getTime()-startDate.getTime())+"ms");

        }
        public void indexLTime(){
            Date startDate = new Date();
            for (int i = 0;i < 100000000;i++){
                linkedList = new LinkedList();


                linkedList.add(0,i);
            }
            Date endDate = new Date();
            System.out.println("LinkedList中间添加元素耗时:"+(endDate.getTime()-startDate.getTime())+"ms");
        }
    }




