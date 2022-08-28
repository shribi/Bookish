package com.bookish.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookish.spring.model.UserDetails;
public interface UserDetailRepository extends JpaRepository<UserDetails, Integer> {
    
}
