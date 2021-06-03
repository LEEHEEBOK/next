package org.example.next.controller;

import org.example.next.domain.User;
import org.example.next.dto.UserDTO;
import org.example.next.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String users(Model model) {
        List<User> users = userService.getUsers();
        List<UserDTO> userDTOList = new ArrayList<>();

        for (User user : users) {
            UserDTO userDTO = new UserDTO();
            userDTO.setUsername(user.getUsername());
            userDTO.setName(user.getName());

            userDTOList.add(userDTO);
        }

        model.addAttribute("users", userDTOList);
        return "userlist";
    }

    @GetMapping("/users/join")
    public String joinForm() {
        return "join";
    }
    @PostMapping("/users/join")
    public String join(UserDTO user) {
        userService.createUser(user);
        return "redirect:/users";
    }
}
