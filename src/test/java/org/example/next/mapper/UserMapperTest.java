package org.example.next.mapper;

import org.example.next.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/web/WEB-INF/applicationContext.xml")
public class UserMapperTest  {

    @Autowired UserMapper userMapper;

    @Test
    public void getUsers() {
        List<User> users = userMapper.selectAllUsers();
        for (User user: users) {
            System.out.println(user.getUsername());
        }
    }
    @Test
    public void insertUser() {
        User user = new User();
        user.setUsername("test123");
        user.setPassword("1234");
        user.setName("1111");

        userMapper.insertUser(user);
    }

}