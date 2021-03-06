package com.neuedu.homewrok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBookManager extends Mybook{
    ArrayList<Mybook> books = new ArrayList<Mybook>();
    Mybook mybook = new Mybook();
    Scanner sc = new Scanner(System.in);
    MyBookTest myBookTest = new MyBookTest();
    public void menu(int choice){
        switch(choice){
            case 1:
                inputData();
                break;
            case 2:
                deleteName();
                break;
            case 3:
                searchName();
                break;
            case 4:

               System.exit(0);
                break;
        }
    }

    //添加图书
    public void inputData(){
        int num = sc.nextInt();
        for(int i = 0;i<num;i++) {
            System.out.println("输入书名：");
            name = sc.next();
            System.out.println("输入价格：");
            price = sc.nextDouble();
            System.out.println("输入出版社：");
            press = sc.next();
            System.out.println("输入作者：");
            author = sc.next();
            System.out.println("输入书的ISBM号：");
            bookISBM = sc.next();
            books.add(new Mybook(name, price, press, author, bookISBM));

            System.out.println(books);
        }
        myBookTest.save();
        System.out.println("添加完成");

    }

    //删除图书
    public void deleteName(){
        System.out.println("请输入要删除的图书名");
        String name1 = sc.next();
        for(int i = 0;i<books.size();i++){
            //System.out.println(mybook.getName());
         if(name1.equals(books.get(i).getName())) {
             books.remove(i);
             //return;
         }
        }
        myBookTest.save();
        System.out.println(books);
    }
    //查找图书
    public void searchName(){
        System.out.println(books);
        System.out.println("请输入要查找的图书名");
        String name1 = sc.next();
        for(int i = 0;i<books.size();i++){
            //System.out.println(mybook.getName());
            if(name1.equals(books.get(i).getName())) {
                System.out.println(books.get(i));
                //return;
            }
        }
        //System.out.println(books);

    }
    //输出图书信息
   public void print(){
        System.out.println( "书名"+name+"价格:"+price+"出版社:"+press+"作者:"+author+"书的ISBN号:"+bookISBM);
      }
}
