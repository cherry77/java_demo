package com.flora.sortpractice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortTest {

    @Test
    void sort() {
        MergeSort sorter = new MergeSort();
        int[] arr = {1,3,4,8,2,5,6,7};
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}