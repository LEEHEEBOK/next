package org.example.next.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.next.domain.User;

import java.util.List;

@Mapper
public interface UserMapper {
    void insertUser(User user);
    User selectUserById(Long userId);
    void updateUser(User user);
    List<User> selectAllUsers();
}
