package com.flora.datastructure;

import org.junit.jupiter.api.Test;

class DoubleLinkedListTest {

    @Test
    void get() {
    }

    @Test
    void addAtHead() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addAtHead(4);
        System.out.println(linkedList.get(1));
    }

    @Test
    void addAtTail() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addAtTail(10);
        linkedList.addAtTail(20);
        linkedList.addAtTail(30);
        linkedList.addAtTail(40);
//        System.out.println(linkedList.get(99));
    }

    @Test
    void addAtIndex() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addAtIndex(0, 10);
        linkedList.addAtIndex(0, 20);
        linkedList.addAtIndex(1, 30);
        linkedList.addAtIndex(0, 20);
    }

    @Test
    void deleteAtIndex() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addAtTail(10);
        linkedList.addAtTail(20);
        linkedList.addAtTail(30);
        linkedList.addAtTail(40);
        linkedList.deleteAtIndex(0);
    }

    @Test
    void test(){
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);
        linkedList.get(1);
        linkedList.deleteAtIndex(1);
        linkedList.get(1);
    }
}