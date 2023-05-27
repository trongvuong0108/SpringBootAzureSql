package com.code.Service;

import com.code.Entity.Brand;
import com.code.Repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    public List<Brand> getAll(){return brandRepository.findAll();}

    public void save(Brand brand){
        brandRepository.save(brand);
    }

    public Brand findBrandByName(String name) {return brandRepository.findFirstByName(name);}

}