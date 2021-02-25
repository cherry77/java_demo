package com.flora.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortTest {

    @Test
    void sort() {
//        BubbleSort sorter = new BubbleSort();
//        int[] arr = {13, 4, 5, 10, 1, 2, 6};
//        sorter.sort(arr);
//        sorter.realSort(arr);
//        System.out.println(Arrays.toString(sorter.sort(arr)));

//        SelectSort sorter = new SelectSort();
//        sorter.sort(arr);

//        InsertSort sorter = new InsertSort();
//        int[] sort = sorter.realSort(arr);
//        System.out.println("=================" + Arrays.toString(sort));

        MergeSort sorter = new MergeSort();
        int[] arr = {1,3,4,8,2,5,6,7};
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}