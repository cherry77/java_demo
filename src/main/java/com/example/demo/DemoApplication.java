package com.example.demo;

import com.example.demo.entity.Student;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @SpringBootApplication 注解来标注一个主程序类，说明这是一个spring boot应用
 */
@EnableCaching
@SpringBootApplication
// 加载mybatis的mapper接口所在的路径
@MapperScan("com.example.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        // spring 应用启动起来
        SpringApplication.run(DemoApplication.class, args);
    }
}
