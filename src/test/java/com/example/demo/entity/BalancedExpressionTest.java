package com.example.demo.entity;

import org.junit.jupiter.api.Test;

class BalancedExpressionTest {

    @Test
    void isBalanced() {
        String expression = "[1 + 2]";
        boolean balanced = new BalancedExpression().isBalanced(expression);
        System.out.println(balanced);
    }
}