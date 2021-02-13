package com.flora.datastructure;

import java.util.Arrays;

/**
 * @author Flora on 2021/1/24.
 */
public class ArrayQueue {
    private int[] items;
    private int front;
    private int rear;
    private int count;

    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    /**
     *  f   r
     * [10 20 30 40]
     * @param item
     */
    public void enqueue(int item){
        if(count == items.length){
            throw new IllegalStateException();
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue(){
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek(){
        return items[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
