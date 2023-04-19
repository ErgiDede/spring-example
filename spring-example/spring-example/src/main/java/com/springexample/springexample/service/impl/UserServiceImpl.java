package com.springexample.springexample.service.impl;


import com.springexample.springexample.mapper.UserMapper;
import com.springexample.springexample.model.dto.UserDTO;
import com.springexample.springexample.model.entity.User;
import com.springexample.springexample.repository.UserRepository;
import com.springexample.springexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;




    /*public UserServiceImpl(EntityManager entityManager) {
        userRepository = new UserRepository(entityManager);
        this.userMapper = new UserMapper();
    }*/

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public List<UserDTO> findAllUsers() {
        return null;
    }

    public User findUserById(Integer id) {
        if (userRepository.findById(id) == null)
            throw new IllegalArgumentException("User with Id : " + id + " does not exist ");
        return userRepository.findById(id).get();

    }



    @Override
    public List<User> retrieveAllUser() {
        return userRepository.findAll();
    }

    @Override
    public List<User> retrieveUsersByFirstName(String firstName) {
        return null;
    }

    @Override
    public User storeUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Boolean deleteUser(Integer id) {
        return null;
    }


}
