package com.SpringbootLearning.security_jwt.service;

import com.SpringbootLearning.security_jwt.entity.Role;
import com.SpringbootLearning.security_jwt.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class RoleService {

    @Autowired
    private RoleRepo roleRepo;


    public Role createNewRole(Role role){
        return roleRepo.save(role);
    }
}
