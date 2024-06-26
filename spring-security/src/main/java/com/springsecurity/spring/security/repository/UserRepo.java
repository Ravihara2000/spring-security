package com.springsecurity.spring.security.repository;

import com.springsecurity.spring.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {


    List<User> findByEmail(String userName);
}
/*{
        "id": 456,
        "email": "user2@email.com",
        "password": "userpassword",
        "role": "admin"
        }*/
/*
{
        "id": 789,
        "email": "anotheruser@email.com",
        "password": "anotherpassword",
        "role": "user"
        }
        {
  "id": 987,
  "email": "user11@gmail.com",
  "password": "0000",
  "role": "user"
}
*/


