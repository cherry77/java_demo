package com.example.demo.entity;

import org.junit.jupiter.api.Test;

class StackTest {

    @Test
    void push() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.toString());
    }

    @Test
    void pop() {
    }
}