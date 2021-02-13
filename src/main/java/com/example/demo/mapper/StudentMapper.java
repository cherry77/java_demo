package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Student;

/**
 * 自定义userMapper接口，若想使用MP提供的CRUD功能，需要继承BaseMapper<T>,T是泛型
 */
public interface StudentMapper extends BaseMapper<Student> {

}
