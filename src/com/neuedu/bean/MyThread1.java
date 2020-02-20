package com.neuedu.bean;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<=100;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //this.getName
            //Thread.currentThread() 获取当前正在执行的线程
            
            System.out.println(Thread.currentThread().getName()+"线程输出"+i);
        }
    }
}
