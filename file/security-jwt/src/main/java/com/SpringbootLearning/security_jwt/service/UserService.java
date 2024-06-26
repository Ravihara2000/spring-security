package com.SpringbootLearning.security_jwt.service;

import com.SpringbootLearning.security_jwt.entity.Role;
import com.SpringbootLearning.security_jwt.entity.User;
import com.SpringbootLearning.security_jwt.repository.RoleRepo;
import com.SpringbootLearning.security_jwt.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    public User RegisterNewUser(User user) {
        return userRepo.save(user);
    }

    public void initRoleAndUser(){
        Role adminRole = new Role();
        Role userRole = new Role();
        if(!roleRepo.existsById("Admin")) {
            adminRole.setRoleName("Admin");
            adminRole.setRoleDescription("Admin role");
            roleRepo.save(adminRole);
        }
        if(!roleRepo.existsById("User")) {
            userRole.setRoleName("User");
            userRole.setRoleDescription("User role");
            roleRepo.save(userRole);
        }


        if(!userRepo.existsById("Admin123")) {
            User user = new User();
            user.setUserName("Admin123");
            user.setUserPassword("Admin@123");
            user.setUserFirstName("Ravi");
            user.setUserLastname("silva");

            Set<Role> adminRoles = new HashSet<>();
            adminRoles.add(adminRole);

            user.setRole(adminRoles);
            userRepo.save(user);
        }

        if(!userRepo.existsById("User123")) {
            User user = new User();
            user.setUserName("User123");
            user.setUserPassword("User@123");
            user.setUserFirstName("janudi");
            user.setUserLastname("kule");

            Set<Role> userRoles = new HashSet<>();
            userRoles.add(userRole);

            user.setRole(userRoles);
            userRepo.save(user);
        }

    }
}
