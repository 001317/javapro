package com.neuedu.test;

public class MyArray {
    private int[] array;
    //实际放的数据得个数
    private int size;
    public MyArray(){
        size = 0;
        array = new int[10];
    }
    public int getSize(){
        return size;
    }
    public void add(int i){
        //如果存放得个数越界 则需要扩容
        if(size>array.length){
            int[] newArray = new int[(int) (array.length*1.5)];
            for(int j = 0;j<array.length;j++){
                newArray[j]=array[j];
            }

            array=newArray;
            System.out.println("扩容完成"+array.length);
        }
        array[size]=i;
        size++;
    }
    public int get(int i){
        //取值   0--size-1
        if(i<0||i>=size){
            System.out.println("索引错误");
            return -1;
        }
        return array[i];
    }
}
