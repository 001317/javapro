package com.neuedu.bean;

/**
 * 2020/02/21 面试：快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,5,8,9,4,3,5,6,1,8,5};
        System.out.println("排序后:");
        sort(arr,0,arr.length-1);
        System.out.println(arr);
    }
    public static void sort(int[] arr,int low,int high){
        if(low<high){
            int index = getIndex(arr,low,high);
            sort(arr,0,index-1);
            sort(arr,index+1,high);
        }
    }
    public static int getIndex(int[] arr,int low,int high){
        int temp = arr[low];
        while(low<high){
            while(low<high&&arr[high]>=temp){
                high--;
            }
            arr[low]=arr[high];
            while(low<high&&arr[low]<=temp){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low] = temp;
        return low;
    }
}
