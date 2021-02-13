package com.flora.datastructure;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author Flora on 2021/1/16.
 */
public class Expression {
    private final List<Character> leftBrackets = Arrays.asList('(', '[', '<', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', ']', '>', '}');

    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()){
            if(isLeftBracket(ch)){
                stack.push(ch);
            }
            if(isRightBracket(ch)){
                if(stack.empty()){
                    return false;
                }
                var top = stack.pop();
                if(!bracketsMatch(top, ch)){
                    return false;
                }
            }
        }
        return stack.empty();
    }


    /**
     * 编写一个函数，该函数接受一个算术表达式作为参数，返回括号缺失的位置。
     * 不匹配的算术表达式的例子：2.3+23/12+（3.14159×0.24
     * @param input
     * @return
     */
    public int findLackBracketPlace(String input){
        var stack = new Stack<Integer>();
        var chArr = input.toCharArray();
        for(int i = 0; i < chArr.length; i++){
            if(chArr[i] == '('){
                stack.push(i);
            }else if(chArr[i] == ')'){
                stack.pop();
            }
        }
        if(!stack.empty()){
            return stack.peek() + 1;
        }
        return -1;
    }

    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
