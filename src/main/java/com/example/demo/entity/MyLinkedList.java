package com.example.demo.entity;

/**
 * @author Flora on 2021/1/19.
 */
public class MyLinkedList {
    ListNode head;
    int size;
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int get(int index){
        if(index <0 || index >= size) return -1;
        var cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur.val;
    }

    /**
     * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
     */
    public void addAtHead(int val){
        var newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size ++;
    }
    /**
     * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
     */
    public void addAtTail(int val){
        var newNode = new ListNode(val);
        if(head == null){
            head = newNode;
        }else{
            ListNode pre = head;
            while (pre.next != null) pre = pre.next;
            pre.next = newNode;
        }
        size ++;
    }
    /**
     * addAtIndex(index,val)：在链表中的第index个节点之前添加值为val 的节点。
     * 如果index等于链表的长度，则该节点将附加到链表的末尾。
     * 如果 index 大于链表长度，则不会插入节点。
     * 如果index小于0，则在头部插入节点。
     * 1 -> 3
     */
    public void addAtIndex(int index, int val){
        if(index >= size) return;
        if(index < 0){
            addAtTail(val);
            return;
        }
        if(index == 0) {
            addAtHead(val);
            return;
        }
        ListNode pre = head;
        for(int i = 0; i < index - 1; i ++) pre = pre.next;
        var newNode = new ListNode(val);
        newNode.next = pre.next;
        pre.next = newNode;

        size++;
    }

    /**
     * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
     */
    public void deleteAtIndex(int index){
        if(index < 0 || index >= size) return;
        if(index == 0){
            deleteAtHead();
            return;
        }
        if(index == size - 1){
            deleteAtTail();
            return;
        }
        var cur = head;
        for(int i = 0; i < index - 1; i ++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }

    public void deleteAtHead(){
        var second = head.next;
        head.next = null;
        head = second;

        size--;
    }

    public void deleteAtTail(){
        var pre = head;
        for(int i = 1; i < size - 1; i ++){
            pre = pre.next;
        }
        pre.next = null;
        size--;
    }

    public boolean hasCycle() {
        if(head == null || head.next == null)   return false;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)    return true;
        }
        return false;
    }
    /**
     * 返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
     */
    public ListNode detectCycle() {
        if(head == null || head.next == null){
            return null;
        }
        var slow = head;
        var fast = head;
        while(fast != null || fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
