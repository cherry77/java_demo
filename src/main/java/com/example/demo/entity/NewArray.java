package com.example.demo.entity;

/**
 * @author Flora on 2020/12/27.
 */
public class NewArray {
    private int[] items;
    private int count;
    public NewArray(int length){
        items = new int[length];
    }

    /**
     * 为什么需要用一个count来表示数组的长度
     * 1. count不是数组本身的长度，而是数组中的有元素的长度
     * 2. 由于数组的大小是动态的，需要有一个准确的计量长度来标识
     *
     */

    void insert(int item){
        if(count == items.length){
            int[] newItems = new int[count * 2];
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    int size(){
        return count;
    }

    int length(){
        return items.length;
    }

    void printReal(){
        for(int i = 0; i < items.length; i++){
            System.out.println(items[i]);
        }
    }

    void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }

    void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        // 10 20 30 40
        // 10 30 40
        for(int i = index; i < count; i++){
            items[i] = items[i+1];
        }
        count--;
    }
}
