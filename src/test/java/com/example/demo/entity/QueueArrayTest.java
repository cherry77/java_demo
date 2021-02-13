package com.example.demo.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueArrayTest {

    @Test
    void push() {
        QueueArray queueArray = new QueueArray(5);
        queueArray.enqueue(10);
        queueArray.enqueue(20);
        queueArray.enqueue(30);
        queueArray.dequeue();
        System.out.println(queueArray.toString());
    }
}