package com.laoshenshi.study;

import com.laoshenshi.study.mapper.UserMapper;
import com.laoshenshi.study.pojo.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        /*List<user> users = userMapper.selectList(null);
        users.forEach(System.out::println);*/

        user user = new user();
        user.setAge(108);
        user.setEmail("123456789@qq.com");
        user.setName("zhangsan");
        user.setId(7L);
        userMapper.insert(user);

        List<user> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}
