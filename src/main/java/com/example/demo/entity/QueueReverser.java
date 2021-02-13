package com.example.demo.entity;

import java.util.Queue;
import java.util.Stack;

/**
 * @author Flora on 2021/1/14.
 */
public class QueueReverser {
    /**
     * 借助栈来实现队列反转
     * @param queue
     */
    public static void reverse(Queue<Integer> queue){
        // declare a stack
        Stack<Integer> stack = new Stack<>();
        // remove value of queue, push it to stack
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        // get stack, add value to queue
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
