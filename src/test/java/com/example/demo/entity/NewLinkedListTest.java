package com.example.demo.entity;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class NewLinkedListTest {

    @Test
    void addFirst() {
        var list = new NewLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
    }

    @Test
    void addLast() {
        var list = new NewLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
    }

    @Test
    void indexOf(){
        var list = new NewLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.indexOf(40));
    }

    @Test
    void contains(){
        var list = new NewLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.contains(90));
    }

    @Test
    void removeFirst(){
        var list = new NewLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeFirst();
    }

    @Test
    void removeLast(){
        var list = new NewLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeLast();
        System.out.println(list.size());
    }

    @Test
    void toArray(){
        var list = new NewLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }

    @Test
    void reverse(){
        var list = new NewLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.reverse();
        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }

    @Test
    void kthFromEnd(){
        var list = new NewLinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addLast(40);
        list.oddEvenList();
        System.out.println(Arrays.toString(list.toArray()));
    }

    @Test
    void isPalindrome(){
        var list = new NewLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);
//        System.out.println(list.isPalindrome());
    }
}