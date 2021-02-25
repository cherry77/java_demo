package com.flora.datastructure;

import java.util.Stack;

/**
 * @author Flora on 2021/2/20.
 */
public class MinStack {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        dataStack.push(x);
        if(minStack.empty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop() {
        var x = dataStack.pop();
        if(x.equals(minStack.peek())){
            minStack.pop();
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
