package com.flora.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LinkedListTest {

    @Test
    void addFirst() {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addLast(30);
        System.out.println(linkedList.indexOf(30));
        linkedList.removeLast();
        System.out.println(Arrays.toString(linkedList.toArray()));
    }

    @Test
    void reverse(){
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.reverse();
        System.out.println(Arrays.toString(linkedList.toArray()));
    }

    @Test
    void getKthFromEnd(){
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        System.out.println(linkedList.getKthFromEnd(1));
    }
}