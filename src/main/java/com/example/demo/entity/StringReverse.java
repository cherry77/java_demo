package com.example.demo.entity;

import java.util.Stack;

/**
 * @author Flora on 2021/1/11.
 */
public class StringReverse {
    public String reverse(String input){
        if(input == null){
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();
        for(Character ch : input.toCharArray()){
            stack.push(ch);
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!stack.empty()){
            stringBuffer.append(stack.pop());
        }
        return stringBuffer.toString();
    }
}
