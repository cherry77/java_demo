package com.flora.datastructure;

import java.util.NoSuchElementException;

/**
 * @author Flora on 2021/1/17.
 */
public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    /**
     * 10 -> 20 -> 30
     * @param item
     */
    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
        size++;
    }

    /**
     * 10 -> 20 -> 30
     * @param item
     */
    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if(current.value == item){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    /**
     * 10 -> 20 -> 30
     */
    public void removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
        }else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size --;
    }

    public void removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
        }else{
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size --;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        int index = 0;
        var current = first;
        while (current != null){
            array[index ++] = current.value;
            current = current.next;
        }
        return array;
    }

    /**
     * 10 -> 20 -> 30
     * 30 -> 20 -> 10
     */
    public void reverse(){
        Node pre = null;
        var current = first;
        while (current != null){
            var next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        last = first;
        first = pre;
    }

    /**
     * 10 -> 20 -> 30 -> 40
     * a     b
     * @param k = 1 (return 40)
     *        k = 2 (return 30)
     *        k = 3 (return 20)
     *        k = 4 (return 10)
     * @return
     */
    public int getKthFromEnd(int k){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        var a = first;
        var b = first;
        for(int i = 0; i < k - 1; i++){
            b = b.next;
            // 如果不知道size就这样验证
            if(b == null){
                throw new IllegalArgumentException();
            }
        }
        while (b != last){
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    private Node getPrevious(Node node){
        var current = first;
        while (current != null){
            if(current.next == node){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private boolean isEmpty(){
        return first == null;
    }
}
