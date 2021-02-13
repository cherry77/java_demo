package com.example.demo.entity;

import java.util.Arrays;

/**
 * @author Flora on 2021/1/12.
 */
public class Stack {
    private int[] items = new int[5];
    private int count;

    public void push(int item){
        items[count++] = item;
    }

    public int pop(){
        if(count == 0){
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public int peek(){
        if(count == 0){
            throw new IllegalStateException();
        }
        return items[count - 1];
    }

    @Override
    public String toString(){
        int[] range = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(items);
    }
}
