package com.flora.datastructure;

import org.junit.jupiter.api.Test;

class HashTableTest {

    @Test
    void put() {
        HashTable table = new HashTable();
        table.put(1, "1111");
        table.put(2, "2222");
        table.put(3, "3333");
        table.put(4, "4444");
        table.put(5, "5555");
        System.out.println(table.get(10));
    }
}