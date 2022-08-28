package com.bookish.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bookish.spring.model.Category;

public interface CategoryRepository extends JpaRepository<Category , Integer> {   
    
}
