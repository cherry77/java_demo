package com.flora.sort;

/**
 * @author Flora on 2021/2/21.
 */
public class BubbleSort {
    /**
     * 13, 4, 5, 10, 1, 2, 6
     * 1 13 5 10 4 2 6
     * 1 5 13
     * @param arr
     * @return
     */
    public int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
