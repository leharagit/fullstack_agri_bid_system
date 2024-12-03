package com.agriculture.bidding_system.Service;
import com.agriculture.bidding_system.Entities.UserEntity;

import java.util.List;

public interface userservice {
    List<UserEntity> getAllUsers();

    UserEntity createUser(UserEntity user);

    UserEntity getUserById(Long userId);

    UserEntity updateUser(Long userId, UserEntity user);

    void deleteUser(Long userId);
}
