package com.example.demo.entity;

import com.example.demo.entity.definition.Animal;
import com.example.demo.entity.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BussinessPerson implements Person {

//    @Autowired
    private Animal animal = null;

    public BussinessPerson(@Autowired @Qualifier("dog") Animal animal){
        this.animal = animal;
    }

    @Override
    public void service(){
        this.animal.use();
    }

    @Override
    public void setAnimal(Animal animal){
        this.animal = animal;
    }

}
