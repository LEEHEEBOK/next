package org.example.next.service;

import org.example.next.domain.User;
import org.example.next.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }
    public void changePassword(String username, String password) {
        for ( User  user : users ) {
            if (user.username == username) {
                user.changePassword(password);
            }
        }
    }

    public void createUser(UserDTO userDTO) {
        User user = new User(userDTO.getUsername(), userDTO.getPassword(), userDTO.getName());
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
