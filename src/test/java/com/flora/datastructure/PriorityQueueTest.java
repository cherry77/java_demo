package com.flora.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueTest {

    @Test
    void add() {
        PriorityQueue queue = new PriorityQueue(5);
        queue.add(1);
        queue.add(3);
        queue.add(8);
        queue.add(5);
        queue.add(4);
//        queue.add(2);
        System.out.println(queue);
    }
}