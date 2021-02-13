package com.flora.datastructure;

import java.util.Stack;

/**
 * @author Flora on 2021/1/16.
 */
public class StringReverse {
    public String reverse(String input){
        if(input == null){
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
        }
        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
