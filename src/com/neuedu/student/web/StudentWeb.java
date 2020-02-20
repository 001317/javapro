package com.neuedu.student.web;

import com.neuedu.student.bean.Student;
import com.neuedu.student.service.IstudentService;
import com.neuedu.student.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentWeb {
    IstudentService istudentService = new StudentService();
    public void showmain(){
        System.out.println("-----------------------");
        System.out.println("1------------------查询");
        System.out.println("2------------------添加");
        System.out.println("3------------------修改");
        System.out.println("4------------------删除");
        System.out.println("5------------------其它");
        System.out.println("-----------------------");
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i==1){
            query();
        }else if(i==2){
            add(sc);
        }else if(i==3){
            update(sc);
        }else if(i==4){
            delete(sc);
        }else{
            System.exit(0);
        }

    }
    private void query(){
        //System.out.println("此处调用查询方法");
        //调用服务层提供的方法访问数据库
        List<Student> list = istudentService.query();
        for(Student student:list){
            System.out.println(student);
        }
    }
    private void add(Scanner scanner){
        System.out.println("请输入要添加的名字");
        String name = scanner.next();
        System.out.println("请输入要添加的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入要添加的性别 1-男 0-女");
        int gender = scanner.nextInt();
        Student stu = new Student(name,age,gender);
        //调用服务层，添加该数据
        istudentService.add(stu);
        //显示列表
        query();

    }
    private void update(Scanner scanner){
        System.out.println("请输入要修改的id");
        int id = scanner.nextInt();
        System.out.println("请输入要修改的名字");
        String name = scanner.next();
        System.out.println("请输入要修改的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入要修改的性别 1-男 0-女");
        int gender = scanner.nextInt();
        Student stu = new Student(id,name,age,gender);
        //调用服务层，修改该数据
        istudentService.update(stu);
        //显示列表
        query();
    }
    private void delete(Scanner scanner){
        System.out.println("请输入要删除的id");
        int id = scanner.nextInt();
        //调用服务层，删除该数据
        istudentService.del(id);
        //显示列表
        query();
    }
}
