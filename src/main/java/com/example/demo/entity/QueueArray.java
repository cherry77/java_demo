package com.example.demo.entity;

import java.util.Arrays;

/**
 * @author Flora on 2021/1/15.
 */
public class QueueArray {
    private int[] items;
    private int front;
    private int rear;
    private int count;

    public QueueArray(int capacity){
        items = new int[capacity];
    }

    public void enqueue(int item){
        if(count == items.length){
            throw new IllegalStateException();
        }
        items[rear++] = item;
        count++;
    }

    public int dequeue(){
        var item = items[front];
        items[front++] = 0;
        count--;
        return item;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
