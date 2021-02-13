package com.example.demo.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

class QueueReverserTest {

    @Test
    void reverse() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        QueueReverser.reverse(queue);
        System.out.println(queue);
    }
}