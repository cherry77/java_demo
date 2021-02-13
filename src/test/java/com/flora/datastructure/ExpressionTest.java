package com.flora.datastructure;

import org.junit.jupiter.api.Test;

class ExpressionTest {

    @Test
    void isBalanced() {
        Expression balanced = new Expression();
        System.out.println(balanced.isBalanced("[(1+2)]"));
    }

    @Test
    void findLackBracketPlace(){
        Expression balanced = new Expression();
        System.out.println(balanced.findLackBracketPlace("2.3+23/12+(3.14159×0.24"));
    }
}