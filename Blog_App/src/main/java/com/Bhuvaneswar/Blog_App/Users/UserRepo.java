package com.Bhuvaneswar.Blog_App.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long>
{
    UserModel save(UserModel userModel);
}
