package com.flora.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTable2Test {

    @Test
    void put() {
        HashTable2 table2 = new HashTable2();
        table2.put(1, "111111111");
        table2.put(2, "222222222");
        table2.put(3, "333333333");
        table2.put(3, "4444444444");
        System.out.println(table2.get(1));
    }
}