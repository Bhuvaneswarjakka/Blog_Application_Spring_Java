package com.Bhuvaneswar.Blog_App.Users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

@DataJpaTest
@ActiveProfiles("test")
public class UserRepoTests
{
    @Autowired
    private UserRepo userRepo;

    @Test
    void can_create_users()
    {
        var user=UserModel.builder()
                .username("BhuviJakka1")
                .email("Bhuvanes@gmail.com")
                .build();
        userRepo.save(user);
    }
}
