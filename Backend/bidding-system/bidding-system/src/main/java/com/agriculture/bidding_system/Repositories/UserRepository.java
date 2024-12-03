package com.agriculture.bidding_system.Repositories;
import com.agriculture.bidding_system.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
