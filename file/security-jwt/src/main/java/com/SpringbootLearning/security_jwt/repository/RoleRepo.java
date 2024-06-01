package com.SpringbootLearning.security_jwt.repository;

import com.SpringbootLearning.security_jwt.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role,String> {
}
