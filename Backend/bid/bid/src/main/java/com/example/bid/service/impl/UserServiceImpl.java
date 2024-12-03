package com.example.bid.service.impl;

import com.example.bid.model.User;
import com.example.bid.repository.UserRepsitory;
import com.example.bid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepsitory userRepsitory;

    //save employee in database
    @Override
    public User saveUser(User employee){
        return userRepsitory.save(employee);
    }

    @Override
    public List<User> getAllUser() {
        return List.of();
    }

    //get all employee form database
    @Override
    public List<User> getUserByID() {
        return userRepsitory.findAll();
    }

    //get employee using id
    @Override
    public User getUserByID(long id) {
        Optional<User> employee =  userRepsitory.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }else {
            throw new RuntimeException();
        }
    }

    //update employee
    @Override
    public User updateUser(User user, long id) {
        User existingUser =
                userRepsitory.findById(id).orElseThrow(
                        ()-> new RuntimeException()
                );
        existingUser.setName(user.getName());
        existingUser.setPhone_Number(user.getPhone_Number());
        existingUser.setEmail(user.getEmail());
        // save
        userRepsitory.save(existingUser);
        return existingUser;
    }

    @Override
    public void deleteUser(long id) {

    }

    //delete employee
    @Override
    public void deleteEmployee(long id) {
        //check
        userRepsitory.findById(id).orElseThrow(()-> new
                RuntimeException());
        //delete
        userRepsitory.deleteById(id);
    }
}
