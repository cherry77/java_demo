package com.flora.datastructure;

import org.junit.jupiter.api.Test;

class MinStackTest {

    @Test
    void push() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }

    @Test
    void pop() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
    }

    @Test
    void top() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
    }

    @Test
    void getMin() {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        stack.getMin();
        stack.pop();
        stack.top();
        stack.getMin();
        System.out.println(stack.getMin());
    }
}