package com.code.Repository;

import com.code.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
    public Category findFirstByName(String name);
}