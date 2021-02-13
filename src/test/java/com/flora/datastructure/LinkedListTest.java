package com.flora.datastructure;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LinkedListTest {

    @Test
    void addFirst() {
        LinkedList list = new LinkedList();
//        list.addFirst(10);
//        list.addFirst(20);
//        list.addFirst(30);
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));
    }
}