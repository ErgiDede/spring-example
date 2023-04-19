package com.springexample.springexample.mapper;

import com.springexample.springexample.model.dto.UserDTO;
import com.springexample.springexample.model.entity.User;


public class UserMapper  extends AbstractMapper<User, UserDTO>{



    @Override
    public User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setRole(userDTO.getRole());
        return null;
    }

    @Override
    public UserDTO toDto(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setRole(user.getRole());
        return userDTO;
    }
}
