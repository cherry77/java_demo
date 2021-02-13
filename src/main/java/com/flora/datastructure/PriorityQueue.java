package com.flora.datastructure;

import java.util.Arrays;

/**
 * @author Flora on 2021/1/24.
 */
public class PriorityQueue {
    private int[] items;
    private int count;

    public PriorityQueue(int capacity){
        items = new int[capacity];
    }

    /**
     * insert 2
     * [1, 3, 5, 7, 8]
     * @param item
     */
    public void add(int item){
        if(isFull()){
            throw new IllegalStateException();
        }
        //写法一：以下写法比较暴力，必须循环整个数组
        /*int temp;
        for(int i = 0; i < count; i ++){
            if(item < items[i]){
                temp = items[i];
                items[i] = item;
                item = temp;
            }
        }
        items[count] = item;*/
        // 写法二：从末尾开始循环
        // [1, 3, 5, 7, 8]
        int i = shiftItemsToInsert(item);
        items[i + 1] = item;
        count++;
    }

    public int shiftItemsToInsert(int item){
        int i;
        for(i = count - 1; i >= 0; i--){
            if(items[i] > item){
                items[i + 1] = items[i];
            }else{
                break;
            }
        }
        return i + 1;
    }

    public boolean isFull(){
        return count == items.length;
    }

    public int remove(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
