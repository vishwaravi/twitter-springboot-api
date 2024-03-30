package com.vishwa.twitter.Entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "users")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;
    
    @Column(name = "user_dob")
    private LocalDate userDob;

    @Column(name = "user_passwd")
    private String userPasswd;

    @Column(name = "time_stamp")
    private String timeStamp;
}
