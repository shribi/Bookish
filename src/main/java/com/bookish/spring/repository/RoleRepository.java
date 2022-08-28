package com.bookish.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bookish.spring.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {    
}
