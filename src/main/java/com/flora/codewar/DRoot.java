package com.flora.codewar;

/**
 * @author Flora on 2021/2/17.
 */
public class DRoot {

    /**
     * 收获知识：
     * int转String类型有三种方法：String.valueOf(i)、Integer.toString(i) 、i+""
     * char类型转换成int类型: Integer.parseInt(String.valueOf(ch));
     * @param n
     * @return
     */
    public static int digitalRoot(int n){
        String s = String.valueOf(n);
        int sum = 0;
        for(char c : s.toCharArray()){
            sum += Integer.parseInt(String.valueOf(c));
        }
        if(sum < 10){
            return sum;
        }
        return digitalRoot(sum);
    }

    public static int digital_root(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
}
