package com.flora.datastructure;

import org.junit.jupiter.api.Test;

class StackTest {

    @Test
    void push() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack);
    }

    @Test
    void pop() {
    }

    @Test
    void peek() {
    }

    @Test
    void isEmpty() {
    }
}