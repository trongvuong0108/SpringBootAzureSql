package com.code;

import com.code.Entity.Brand;
import com.code.Entity.Car;
import com.code.Entity.Category;
import com.code.Service.BrandService;
import com.code.Service.CarService;
import com.code.Service.CategoryService;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootAzureSqlApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzureSqlApplication.class, args);
	}
}

