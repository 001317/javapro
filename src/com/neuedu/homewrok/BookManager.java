package com.neuedu.homewrok;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class BookManager {
    LinkedHashMap<String,Book> stu = new LinkedHashMap<>();
    Book book = new Book();
    Scanner sc = new Scanner(System.in);

    public void Manage(int choice){
        switch (choice){
            case 0:
                add();
            break;
            case 1:
                find();
                break;
            case 2:
                delete();
                break;
            default:


        }
    }


    //添加方法
    public void add(){
        System.out.println("编号");
        String key = sc.next();
        System.out.println("名称");
        String name =  sc.next();
        System.out.println("图书码");
        String id = sc.next();
        System.out.println("图书价格");
        double price = sc.nextDouble();
        System.out.println("图书书数目");
        int num = sc.nextInt();

        stu.put(key,new Book(name,id,price,num));
        System.out.println("添加完成");

    }
    //查看方法
    public void find(){
        System.out.println("所有图书如下");
        Set<String> set = stu.keySet();
        for(String key:set){
            System.out.println(stu.get(key));
            if(stu.get(key).getNum()==0){
                System.out.println("不可借");
            }else if(stu.get(key).getNum()>0){
                System.out.println("可借");
            }
        }
    }
    //删除方法
    public void delete(){
        System.out.println("请输入删除的图书信息");
        String key2 = sc.next();
        Set<String> set = stu.keySet();
        for(String key:set){
            if(stu.get(key).getName().equals(key2)){
                stu.remove(key);
                System.out.println("删除成功");
            }else{
                System.out.println("该书不存在");
            }
        }
    }
}
