package com.example.demo.entity;

import java.util.NoSuchElementException;

/**
 * @author Flora on 2021/1/5.
 */
public class NewLinkedList {
    private Node first;
    private Node last;
    private int size = 0;

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * add first
     * 1 -> 2 -> 3
     *
     * @param item
     */
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    /**
     * add last
     * 1 -> 2 -> 3
     *
     * @param item
     */
    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public int indexOf(int item) {
        var current = first;
        int index = 0;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * 1 -> 2 -> 3
     */
    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    /**
     * 1 -> 2 -> 3
     */
    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] arr = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            arr[index++] = current.value;
            current = current.next;
        }
        return arr;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    /**
     * 1 -> 2 -> 3  -> 4
     * 1  2 -> 3 -> 4
     */
    public void reverse() {
        Node pre = null;
        Node cur = first;
        last = cur;
        while (cur != null) {
            var next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        first = pre;
    }

    /**
     * 1 -> 2 -> 3  -> 4
     * k = 3
     * *         *
     * @return
     */
    public int kthFromEnd(int k){
        var current = first;
        for(int i = 1; i < k; i ++){
            current = current.next;
        }
        var pre = first;
        while(current.next!=null){
            pre = pre.next;
            current = current.next;
        }
        return pre.value;
    }

    /**
     * 删除链表的倒数第N个节点
     * @param k
     * @return
     */
    public Node removeKthFromEnd(int k) {
        if(first == null) return null;
        var fast = first;
        // find the pre node
        for(int i = 0; i <= k; i ++){
            fast = fast.next;
        }
        var slow = first;
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        var pre = slow;
        slow.next = slow.next.next;
        return pre;
    }

    public Node oddEvenList() {
        if(first == null) return null;

        var odd = first;
        var even = first.next;
        var evenHead = first.next;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return first;
    }

    /**
     * 请判断一个链表是否为回文链表。
     * 1->2->2->1 true
     * 2->3->4->3->2
     * @return
     */
//    public boolean isPalindrome() {
//
//    }

    private boolean isEmpty() {
        return first == null;
    }
}
