package com.example.bid.service;

import com.example.bid.model.User;

import java.util.List;



public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();

    //get all employee form database
    List<User> getUserByID();



    //get employee using id
    User getUserByID(long id);

    //update employee
    User updateUser(User user, long id);
    //delete users
    void deleteUser(long id);

    //delete employee
    void deleteEmployee(long id);
}
