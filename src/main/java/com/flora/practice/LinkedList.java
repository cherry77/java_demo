package com.flora.practice;

import java.util.NoSuchElementException;

/**
 * @author Flora on 2021/2/18.
 * addFirst addLast indexOf removeFirst removeLast size toArray reverse getKthFromEnd
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

    public void addFirst(int value){
        var node = new Node(value);
        if(isEmpty()){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int value){
        var node = new Node(value);
        if(isEmpty()){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public int indexOf(int value){
        var cur = first;
        int index = 0;
        while (cur != null){
            if(cur.value == value){
                return index;
            }
            cur = cur.next;
            index++;
        }
        return -1;
    }

    /**
     * 1 -> 2 -> 3
     */
    public void removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
        }else{
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
        }else{
            var pre = getPrevious(last);
            last = pre;
            last.next = null;
        }
        size--;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] arr = new int[size];
        var cur = first;
        int index = 0;
        while (cur != null){
            arr[index++] = cur.value;
            cur = cur.next;
        }
        return arr;
    }

    /**
     * 1 -> 2 -> 3
     *
     */
    public void reverse(){
        last = first;

        Node pre = null;
        var cur = first;
        while (cur != null){
            var next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        first = pre;
    }

    /**
     * 1 -> 2 -> 3
     * k = 2
     * p        q
     * @return
     */
    public int getKthFromEnd(int k){
        if(k < 0 || k >= size){
            throw new IllegalStateException();
        }
        var p = first;
        var q = first;
        for(int i = 0; i < k - 1; i++){
            q = q.next;
        }
        while (q.next != null){
            p = p.next;
            q = q.next;
        }
        return p.value;
    }

    /**
     * 判断一个链表是否是回文链表
     * 1.快慢指针（折半法）找到前半部分的最后一个节点
     * 2.翻转后半部分
     * 3.遍历逐个值比较
     * 4.风险：该方法虽然可以将空间复杂度降到 O(1)O(1)，但是在并发环境下，该方法也有缺点。在并发环境下，函数运行时需要锁定其他线程或进程对链表的访问，因为在函数执行过程中链表会被修改。
     * @return
     */
    public boolean isPalindrome() {
        if(first == null){
            return true;
        }
        // 快慢指针找到前半部分链表的尾节点
        var slow = first;
        var fast = first;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // 反转后半部分链表
        var secondHalf = reverse(slow);
        // 逐个值比较
        var p = first;
        var q = secondHalf;
        while (p != null && q != null){
            if(p.value != q.value){
                return false;
            }
            p = p.next;
            q = q.next;
        }
        // 还原链表并返回结果
        first.next = reverse(secondHalf);
        return true;
    }

    private Node reverse(Node head){
        Node pre = null;
        var cur = head;
        while (cur != null){
            var next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    private Node getPrevious(Node node){
        var cur = first;
        while (cur != null){
            if(cur.next == node){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    private boolean isEmpty(){
        return size == 0;
    }
}
