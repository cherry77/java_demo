package com.flora.datastructure;

import java.util.Queue;
import java.util.Stack;

/**
 * @author Flora on 2021/1/24.
 */
public class QueueReverse {

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.empty()){
            queue.add(stack.pop());
        }
    }
}
