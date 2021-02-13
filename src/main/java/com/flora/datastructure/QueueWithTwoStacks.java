package com.flora.datastructure;

import java.util.Stack;

/**
 * @author Flora on 2021/1/24.
 */
public class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    /**
     * O(1)
     * @param item
     */
    public void enqueue(int item){
        stack1.push(item);
    }

    /**
     * O(n)
     * [1]
     * [2]
     * 从队列的开头移出一项
     * @return
     */
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        moveStack1ToStack2();
        return stack2.pop();
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        moveStack1ToStack2();
        return stack2.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void moveStack1ToStack2(){
        if(stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
    }
}
