package org.example.next.service;

import org.example.next.domain.User;
import org.example.next.dto.UserDTO;
import org.example.next.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void changePassword(String username, String password) {

    }

    public void createUser(UserDTO userDTO) {
        User user = new User(userDTO.getUsername(), userDTO.getPassword(), userDTO.getName());
        userMapper.insertUser(user);
    }

    public List<User> getUsers() {
        return userMapper.selectAllUsers();
    }
}
