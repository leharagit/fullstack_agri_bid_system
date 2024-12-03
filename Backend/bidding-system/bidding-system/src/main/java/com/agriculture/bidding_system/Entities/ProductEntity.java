package com.agriculture.bidding_system.Entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user; // Seller reference

    private String name;
    private String category;
    private String description;
    private int quantity;
    private double quality;
    private String location;
    private double startBidPrice;
    private double buyNowPrice;
    private String size; // Dimensions/Weight
    private String status; // Available, Sold
    private int productQuantity; // Stock

}
