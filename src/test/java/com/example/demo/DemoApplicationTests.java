package com.example.demo;

import com.example.demo.entity.Array;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private StudentMapper studentMapper;

    @Resource
    UserService userService;

    @Test
    void test(){
        Student cherry = new Student();
        System.out.println(cherry);
        System.out.println(cherry.getSno());
        System.out.println(cherry.getSsex());
        System.out.println(cherry.getSbirthday());
        System.out.println(cherry.getSname());
    }


    @Test
    public void testSelectList() {
        List<Student> studentList = studentMapper.selectList(null);
        System.out.println("=============");
        for(Student student : studentList){
            System.out.println(student);
        }
    }

    @Test
    public void testInsert () {
        Student student = new Student();
//        student.setSno("112");
        student.setSname("cherry2");
        student.setSsex("男");
//        student.setSclass("95031");
        int count = studentMapper.insert(student);
        if (count > 0){
            System.out.println("Insert success");
        }else{
            System.out.println("Insert failed");
        }
    }

    @Test
    void getUser(){
        userService.getUser();
    }

    @Test
    void delUser(){
        userService.delUserById(1);
    }


    @Test
    void vote(){
        userService.vote();
    }

    @Test
    void testArray(){
        Array arr = new Array(3);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        arr.insert(60);
        arr.removeAt(4);
        arr.print();
    }

    @Test
    void testMergeLinkedList(){
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Amy");
        list1.add("Bob");
        list1.add("Jack");
        list1.add("mike");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("cherry");
        list2.add("flora");
        list2.add("jane");
        list2.add("mike");

//        ListIterator<String> iterator1 = list1.listIterator();
//        Iterator<String> iterator2 = list2.iterator();
//        while (iterator2.hasNext()){
//            if(iterator1.hasNext()) iterator1.next();
//            iterator1.add(iterator2.next());
//        }
        /*var iterator = list2.iterator();
        while (iterator.hasNext()){
            iterator.next();
            if(iterator.hasNext()){
                iterator.next();
                iterator.remove();
            }
        }*/
        list1.removeAll(list2);

        System.out.println("==========" + list1);
        System.out.println("==========" + list2);
    }
    @Test
    void test1(){
        List<String> l1 = new ArrayList<String>();
        List<Integer> l2 = new ArrayList<Integer>();
        System.out.println(l1.getClass());
        System.out.println(l2.getClass());
        System.out.println(l1.getClass() == l2.getClass());
    }
}
