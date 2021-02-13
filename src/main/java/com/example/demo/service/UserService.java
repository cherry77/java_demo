package com.example.demo.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    private static final int ONE_WEEK_IN_SECONDS = 7 * 86400;
    private static final int VOTE_SCORE = 432;

    @Resource
    RedisTemplate redisTemplate;

    @Cacheable(value = "user", key = "'getUser'")
    public String getUser(){
        System.out.println("================");
        return "222222222222222";
    }

    @CacheEvict(value = "user", allEntries = true)
    public boolean delUserById(Integer id){
        return true;
    }

    @Cacheable(value = "user", key = "'getUserById' + #id")
    public String getUserById(Integer id){
        return "getUserById" + id;
    }

    public void vote(){
        long cutoff = System.currentTimeMillis() - ONE_WEEK_IN_SECONDS;
        System.out.println("============" + cutoff);
    }

    public void postArticle(){

    }
}
