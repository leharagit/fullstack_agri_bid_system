package com.agriculture.bidding_system.Entities;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity { @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long userId;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String role; // Farmer, Buyer, Admin
    private String address;
    private String location; // Coordinates
}
