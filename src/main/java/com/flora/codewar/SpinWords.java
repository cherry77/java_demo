package com.flora.codewar;

/**
 * @author Flora on 2021/2/13.
 */
public class SpinWords {
//    public String spinWords(String sentence) {
//        String[] arr = sentence.split(" ");
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i].length() > 4){
//                arr[i] = new StringBuilder(arr[i]).reverse().toString();
//            }
//        }
//        return String.join(" ", arr);
//    }
public String spinWords(String sentence) {


    for (String a : sentence.split(" "))
    {
        if (a.length()> 4)
        {
            sentence = sentence.replace(a, new  StringBuffer(a).reverse());
        }


    }
    return sentence;
}
}
