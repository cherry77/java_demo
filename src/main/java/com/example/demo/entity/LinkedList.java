package com.example.demo.entity;

/**
 * @author Flora on 2020/12/29.
 */
public class LinkedList {
    private Node first;
    private Node last;

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void addFirst(int item){
        Node node = new Node(item);
        if(first == null){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }
    }

    /**
     * 10 -> 20 -> null
     * @param item
     */
    public void addLast(int item){
        Node node = new Node(item);
        if(first == null){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
    }

    public void reverse(){
        // 1.定义初始值
        Node pre = null;
        Node cur = first;
        last = cur;
        // 2.反转主体
        while (cur != null){
            var next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        first = pre;
    }
}
