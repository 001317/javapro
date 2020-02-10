package com.neuedu.homewrok;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager book = new BookManager();
        boolean flag = true;
        while(flag){
            System.out.println("0 添加图书");

            System.out.println("1 查找图书");

            System.out.println("2 删除图书");
            int choice = sc.nextInt();
            book.Manage(choice);
        }
    }
}
