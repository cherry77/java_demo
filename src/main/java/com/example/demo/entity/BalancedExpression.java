package com.example.demo.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author Flora on 2021/1/12.
 */
public class BalancedExpression {

    private final List<Character> leftBrackets = Arrays.asList('(', '[');
    private final List<Character> rightBrackets = Arrays.asList(')', ']');

    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();
        for(Character ch : input.toCharArray()){
            if(isLeftBracket(ch)){
                stack.push(ch);
            }
            if(isRightBracket(ch)){
                if(stack.empty()) {
                    return false;
                }
                var top = stack.pop();
                if(!bracketMatch(top, ch)){
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private boolean isLeftBracket(Character ch){
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(Character ch){
        return rightBrackets.contains(ch);
    }

    private boolean bracketMatch(Character left, Character right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
