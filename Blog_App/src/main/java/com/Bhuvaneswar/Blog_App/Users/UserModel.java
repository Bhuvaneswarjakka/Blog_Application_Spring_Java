package com.Bhuvaneswar.Blog_App.Users;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username", nullable = false)
    @NonNull
    private String username;

    @Column(name = "password", nullable = false)
    @NonNull
    private String password;

    @Column(name = "email", nullable = false)
    @NonNull
    private String email;

    @Column(name = "image", nullable = true)
    @Nullable
    private String image;

    @Column(name = "bio", nullable = true)
    @Nullable
    private String bio;


    private String authToken;
}
