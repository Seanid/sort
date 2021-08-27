package com.luckycode;

import java.util.Arrays;

/**
 * 插入排序
 * 时间复杂度O(n^2)
 * 空间复杂度O(1)
 */
public class InsertSort {

    public static int[] insertSort(int[] arr){
        if (arr.length==0){
            return arr;
        }

        int t=0;
        for (int i=0;i<arr.length-1;i++){
            t=arr[i+1];
            int preIndex=i;
            while (preIndex>=0&&t<arr[preIndex]){
                arr[preIndex+1]=arr[preIndex];//从前往后移动
                arr[preIndex]=t;
                preIndex--;
            }
            arr[preIndex+1]=t;

        }
        return arr;

    }


    public static void main(String[] args) {
        int[] arr=new int[]{1,25,4,1,3,6,1,5,8,5,96,54,521,53};
        System.out.println(Arrays.toString(insertSort(arr)));
    }
}
