//package com.neuedu.homewrok;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Scanner;
//
//public class Test1 {
//    public static void main(String[] args) {
//        ArrayList<Mybook> list = new ArrayList<Mybook>();
//        Mybook mybook = new Mybook();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入个数：");
//        int num =sc.nextInt();
//        for (int i = 1;i<=num;i++){
//            mybook.inputData();
//            list.add(mybook);
//            mybook.print();
//        }
////        for(int i=0;i<list.size();i++) {
////            System.out.println(list.get(i));
////        }
//        Iterator<Mybook> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//    }
////    public static void menu(){
////        System.out.println("请输入1-4中的任一个数字"+"/n"+"1.添加图书"+
////               "2：删除图书"+"3：查找图书（根据用户名）"+"4：退出当用户" );
////    }
//}
