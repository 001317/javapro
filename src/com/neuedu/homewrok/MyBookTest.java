package com.neuedu.homewrok;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBookTest {
    static ArrayList<Mybook> books = new ArrayList<Mybook>();
    public static File file = new File("d:/books");
    public static void main(String[] args) {

        MyBookManager mybook =new MyBookManager();
        if(!file.exists()) {
            mybook.inputData();
            save();
        }else{
            read();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("运行");
        MyBookManager myBookManager = new MyBookManager();

//        myBookManager.inputData();
//        myBookManager.deleteName();
        boolean flag = true;
        while(flag){
            System.out.println("1 添加图书");
            System.out.println("2 删除图书");
            System.out.println("3 查找图书");
            System.out.println("4 退出");
            int choice = sc.nextInt();
            myBookManager.menu(choice);
        }


    }
    public static void save(){
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(books);
            objectOutputStream.flush();
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                }catch(IOException e){
                e.printStackTrace();
            }
    }

}
    public static void read(){
        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);
            books = (ArrayList<Mybook>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(inputStream!=null&&objectInputStream!=null){
                try {
                    objectInputStream.close();
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
