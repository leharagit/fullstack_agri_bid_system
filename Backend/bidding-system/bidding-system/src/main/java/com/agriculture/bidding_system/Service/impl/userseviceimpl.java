package com.agriculture.bidding_system.Service.impl;
import com.agriculture.bidding_system.Entities.UserEntity;
import com.agriculture.bidding_system.Service.userservice;
import com.agriculture.bidding_system.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class userseviceimpl implements  userservice{
    private final UserRepository userRepository;

    @Autowired
    public userseviceimpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity getUserById(Long userId) {
        Optional<UserEntity> user = userRepository.findById(userId);
        return user.orElseThrow(() -> new RuntimeException("User not found with id " + userId));
    }

    @Override
    public UserEntity updateUser(Long userId, UserEntity user) {
        if (userRepository.existsById(userId)) {
            user.setUserId(userId);  // Ensure the existing userId is set
            return userRepository.save(user);
        } else {
            throw new RuntimeException("User not found with id " + userId);
        }
    }

    @Override
    public void deleteUser(Long userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
        } else {
            throw new RuntimeException("User not found with id " + userId);
        }
    }


}
