package com.example.demo.entity;

import org.junit.jupiter.api.Test;

class TreeTest {

    @Test
    void insert() {
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(3);
        tree.insert(2);
        tree.insert(5);
        tree.insert(6);
        tree.insert(9);
        tree.insert(7);
        System.out.println(tree.isBinarySearchTree());
        tree.traversePreOrder2();
    }
}