package com.luckycode;

import java.util.Arrays;

/**
 * 选择排序
 * 时间复杂度O(n^2)
 * 空间复杂度O(1)
 */
public class SelectSort {

    public static int[] selectSort(int[] arr){
        if (arr.length==0){
            return arr;
        }

        for (int i=0;i<arr.length;i++){
            int index=i;
            for (int j=i;j<arr.length;j++){
                if (arr[index]<arr[j]){
                    index=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[index];
            arr[index]=t;
        }
        return  arr;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,25,4,1,3,6,1,5,8,5,96,54,521,53};
        System.out.println(Arrays.toString(selectSort(arr)));
    }
}
