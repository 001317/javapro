package com.neuedu.homewrok;

import java.util.ArrayList;
import java.util.Scanner;

public class MyBookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBookManager myBookManager = new MyBookManager();

//        myBookManager.inputData();
//        myBookManager.deleteName();
        boolean flag = true;
        while(flag){
            System.out.println("1 添加图书");

            System.out.println("2 删除图书");

            System.out.println("3 查找图书");
            System.out.println("4 修改图书");
            int choice = sc.nextInt();
            myBookManager.menu(choice);
        }

    }
}
