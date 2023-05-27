package com.code.Repository;

import com.code.Entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BrandRepository extends JpaRepository<Brand, UUID> {
    public Brand findFirstByName(String name);
}