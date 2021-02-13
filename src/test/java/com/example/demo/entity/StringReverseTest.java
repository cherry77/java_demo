package com.example.demo.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {

    @Test
    void reverse() {
        String str = "abcdefg";
        String result = new StringReverse().reverse(str);
        System.out.println(result);
    }
}