package com.flora.sort;

/**
 * @author Flora on 2021/2/22.
 */
public class MergeSort {
    public void sort(int[] arr){
        if(arr.length < 2) return;

        // divide two half
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        for(int i = mid; i < arr.length; i++){
            right[i - mid] = arr[i];
        }
        // recursion sort
        sort(left);
        sort(right);
        // merge
        merge(left, right, arr);
    }

    private int[] merge(int[] left, int[] right, int[] result){
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                result[k++] = left[i++];
            }else{
                result[k++] = right[j++];
            }
        }
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
        return result;
    }
}
