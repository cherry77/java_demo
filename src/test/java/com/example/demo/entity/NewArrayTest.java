package com.example.demo.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class NewArrayTest {

    @Test
    void testNewArray(){
        List<Integer> arrayList = new ArrayList<Integer>();
        NewArray arr = new NewArray(3);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        System.out.println("==============size" + arr.size());
        System.out.println("==============length" + arr.length());
        arr.removeAt(1);
        arr.printReal();
//        arr.print();
    }
}