package com.example.demo.entity;

import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void addFirst() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.reverse();
    }

    @Test
    void addLast() {
    }
}