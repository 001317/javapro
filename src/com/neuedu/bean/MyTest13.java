package com.neuedu.bean;

import com.neuedu.bean.MyThread1;
import com.neuedu.bean.MyThread2;

public class MyTest13 {
    public static void main(String[] args) {
        /*进程：正在运行的程序
        * 线程 是进程的一个执行过程
        * 一个进程可以包含多个线程 至少有一个线程
        *如何创建多线程
        *   1 继承thread类
        *   2 实现runnable接口
        *   3 线程池
        *   如果用继承Thread类或者实现runnable接口，则必须重写run()方法
        *   当执行的时候调用run()方法  并不是以线程的方法启动
        *   只是调用了一个方法
        *   要用start()方法启动线程 启动线程后 该线程才能运行起来
        *   入口就是run()
        *   Thread类中  有一个方法叫sleep 暂时放弃对cpu的抢占
        *   Thread.sleep(500),500毫秒内该线程不会抢占cpu
        *   500毫秒之后再去抢占cpu 能不能抢到不一定
        *
        *
        * */
        /*
        *   lambda 表达式
        *   匿名内部类的一个变体写法
        *   匿名内部类
        *   接口和抽象类不能被实例化
        *   接口和抽出类可以new
        *   new 接口/抽象类  ->  匿名内部类
        *   lambda表达式  必须有个接口
        *   并且  接口中只能有一个抽象方法（重点）
        *
        *
        * */
//        MyThread1 t1 = new MyThread1();
//        t1.start();
//        MyThread1 t2 = new MyThread1();
//        t2.start();
        /*MyThread2 t3 = new MyThread2();
        Thread t = new Thread(t3);

        t.start();*/
        /*eat();
        talk();
        drink();*/
        /*MyInterface add = new MyAdd();
        MyInterface sub = new MySub();
        MyInterface mul = new MyMul();
        MyInterface div = new MyDiv();*/
        /*MyInterface add = new MyInterface() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        };*/
       /* System.out.println(method(12,20,new MyInterface() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        }));*/
      /* Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0;i<100;i++){
                   try {
                       Thread.sleep(500);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName()+"当前线程名"+i);
               }
           }
       });*/
      Thread t1 = new Thread(()->{
          
              for (int i = 0;i<100;i++){
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println(Thread.currentThread().getName()+"当前线程名"+i);
              }
      });
       t1.start();
        System.out.println(method(12,20,(a,b)->{
            return a-b;
        }));
    }
    public static void eat(){}
    public static void talk(){}
    public static void drink(){}
    public static int method(int a,int b,MyInterface myInterface){
        return myInterface.method(a,b);
    }
}
