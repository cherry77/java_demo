package com.flora.datastructure;

/**
 * @author Flora on 2021/2/18.
 */
public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList(){
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }

    private class Node{
        private Node prev;
        private int val;
        private Node next;

        public Node(int val) {this.val = val;}
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        var preNode = getPrevious(index) ;
        return preNode.next.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    /** Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list, the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted.
     * 0 -> 1 -> 2 -> 0
     */
    public void addAtIndex(int index, int val) {
        if(index > size) return;

        if (index < 0) index = 0;

        var newNode = new Node(val);
        var preNode = getPrevious(index);
        System.out.println(preNode.val);

        newNode.prev = preNode;
        newNode.next = preNode.next;
        preNode.next.prev = newNode;
        preNode.next = newNode;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        var preNode = getPrevious(index);
        preNode.next = preNode.next.next;
        preNode.next.prev = preNode;
        size--;
    }

    public int size(){
        return size;
    }

    private Node getPrevious(int index){
        var prevNode = head;
        if(index + 1 < size - index){
            for(int i = 0; i < index + 1; i++){
                prevNode = prevNode.next;
            }
        }else{
            prevNode = tail;
            for(int i = 0; i < size - index; i++){
                prevNode = prevNode.prev;
            }
        }
        return prevNode;
    }
}
