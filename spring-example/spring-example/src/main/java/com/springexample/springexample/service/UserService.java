package com.springexample.springexample.service;


import com.springexample.springexample.model.dto.UserDTO;
import com.springexample.springexample.model.entity.User;

import java.util.List;

public interface UserService {


    User findUserById(Integer id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(User user);


    List<UserDTO> findAllUsers();


    List<User> retrieveAllUser();

    List<User> retrieveUsersByFirstName(String firstName);

    User storeUser(User user);

    Boolean deleteUser(Integer id);
}


