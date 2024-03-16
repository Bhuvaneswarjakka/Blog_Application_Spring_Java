package com.Bhuvaneswar.Blog_App.Users;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@RequiredArgsConstructor
public class UserModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    @NonNull
    private String username;

//    @Column(name = "password", nullable = false)
//    @NonNull
//    private String password;

    @Column(nullable = false)
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
