package com.flora.sort;

import java.util.Arrays;

/**
 * @author Flora on 2021/2/21.
 */
public class InsertSort {
    public int[] sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i;
            while (j >= 1){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public int[] realSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            var current = arr[i];
            int j = i;
            while (j >= 1 && arr[j-1] > current){
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }
        return arr;
    }
}
