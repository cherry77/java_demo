package com.example.demo.entity;

import com.example.demo.entity.definition.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    @Override
    @Qualifier("dog")
    public void use(){
        System.out.println("狗" + Dog.class.getSimpleName());
    }
}
