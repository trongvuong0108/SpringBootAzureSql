package com.code.Service;

import com.code.Entity.Category;
import com.code.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAll(){return categoryRepository.findAll();}

    public void save(Category category){
        categoryRepository.save(category);
    }

    public Category findCategoriesByName(String name) {
        System.out.println(categoryRepository.findFirstByName(name).getName());
        return categoryRepository.findFirstByName(name);
    }
}