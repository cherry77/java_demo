package com.flora.datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Flora on 2021/1/24.
 */
public class CharFinder {
    public char findFirstNonRepeatChar(String input){
        Map<Character, Integer> map = new HashMap<>();

        var chars = input.toCharArray();
        for(char ch : chars){
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for(char ch : chars){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
}
