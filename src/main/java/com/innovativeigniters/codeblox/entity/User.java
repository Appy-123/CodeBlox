package com.innovativeigniters.codeblox.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String passwordHash;
    private Date registrationDate;
    private Date lastLoginDate;
    private String role; // Consider using an enum here

    // Getters and Setters
}
