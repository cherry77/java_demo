package com.flora.datastructure;

import org.junit.jupiter.api.Test;

class ArrayTest {

    @Test
    void insert() {
        Array array = new Array(2);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.print();
        System.out.println(array.size());
    }
}