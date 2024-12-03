package com.example.bid.controller;

import com.example.bid.model.User;
import com.example.bid.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/User")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.CREATED);
    }
    //GetAll Rest Api
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    //Get by Id Rest Api
    @GetMapping("{id}")
    // localhost:8080/api/employees/1
    public ResponseEntity<User> getUserByID(@PathVariable("id") long
                                                            userID){
        return new
                ResponseEntity<User>(userService.getUserByID(userID),HttpStatus.OK);
    }

    //Update Rest Api
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") long
                                                           id,
                                                   @RequestBody User
                                                           user){
        return new
                ResponseEntity<User>(userService.updateUser(user,id),HttpStatus.OK);
    }
    //Delete Rest Api
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long
                                                         id){
//delete employee from db
        userService.deleteUser(id);
        return new ResponseEntity<String>("Employee deleted Successfully.",HttpStatus.OK);
    }
}


