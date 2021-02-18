package com.flora.codewar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpinWordsTest {

    @Test
    void spinWords() {
        String s = new SpinWords().spinWords("emocleW heoollw");
        System.out.println(s);
    }
}