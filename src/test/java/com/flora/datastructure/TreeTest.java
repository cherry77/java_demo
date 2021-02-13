package com.flora.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void insert() {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(6);
        tree.insert(9);
        tree.insert(1);
        tree.insert(10);
        System.out.println(tree.find(9));
    }
}