package com.neuedu.homewrok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBookManager extends Mybook{
    ArrayList<Mybook> books = new ArrayList<Mybook>();
    Mybook mybook = new Mybook();
    Scanner sc = new Scanner(System.in);

    public void menu(int choice){
        switch(choice){
            case 1:
                inputData();
                break;
            case 2:
                deleteName();
                break;
            case 3:
                print();
//            case 4:
//                return "退出当前用户";
//            default:
        }
    }

    //添加图书
    public void inputData(){
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
        books.add(new Mybook(name,price,press,author,bookISBM));
        System.out.println("添加完成");
        System.out.println(books);
    }

    //删除图书
    public void deleteName(){
        System.out.println("请输入要删除的图书名");
        String name1 = sc.next();
        for(int i = 0;i<books.size();i++){
            if(mybook.getName().equals(name1)){
                //books.remove(i);
                System.out.println("11");
            }else{
                System.out.println("该书不存在");
            }
        }
        System.out.println(books);
    }
    //查找图书
    public void searchName(ArrayList<Mybook> books,String name){

    }
    //输出图书信息
   public void print(){
        System.out.println( "书名"+name+"价格:"+price+"出版社:"+press+"作者:"+author+"书的ISBN号:"+bookISBM);
      }
}
