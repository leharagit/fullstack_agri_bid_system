package com.agriculture.bidding_system.Repositories;
import com.agriculture.bidding_system.Entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
