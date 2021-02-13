package com.flora.fanxing;

import java.util.Arrays;

/**
 * @author Flora on 2021/1/17.
 */
class Base{}

class Sub extends Base{}

public class Cache<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
//        Cache<String> cache = new Cache<>();
//        cache.setValue("123");
//        String value = cache.getValue();
//        List<Sub> lsub = new ArrayList<>();
//        List<Base> lbase = lsub;

//        Erasure<String> erasure = new Erasure<String>("hello");
//        Class eclz = erasure.getClass();
//        System.out.println("erasure class is:"+eclz.getName());
        Object[] objects = new Object[10];
        objects[0] = 12;
        objects[1] = "错误";
        System.out.println(Arrays.toString(objects));
        System.out.println(new Object());
    }
}

class Erasure <T>{
    T object;
    public Erasure(T object) {
        this.object = object;
    }
}


