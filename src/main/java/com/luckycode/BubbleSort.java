package com.luckycode;

import java.util.Arrays;

/**
 * 冒泡排序
 * 算法负责度：O（n^2）
 * 空间复杂度：O（1）
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] array){
        if (array.length==0){
            return array;
        }

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]<array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,25,4,1,3,6,1,5,8,5,96,54,521,53};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
