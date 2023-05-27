package com.code.Service;

import com.code.Dto.CarDTO;
import com.code.Entity.Car;
import com.code.Repository.BrandRepository;
import com.code.Repository.CarRepository;
import com.code.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CarService {
    private final CarRepository carRepository;
    private final BrandRepository brandRepository;
    private final CategoryRepository categoryRepository;
    public CarService(CarRepository carRepository, BrandRepository brandRepository, CategoryRepository categoryRepository) {
        this.carRepository = carRepository;
        this.brandRepository = brandRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Car> getAll(){return carRepository.findAll();}

    public void save(Car car){
        carRepository.save(car);
    }

    public void create(CarDTO carDTO){
        Car car = new Car(
                carDTO.getName(),
                carDTO.getSeat(),
                carDTO.getPrice(),
                carDTO.getColor(),
                categoryRepository.findById(carDTO.getCategoryId()).get(),
                brandRepository.findById(carDTO.getBrandId()).get()
        );
        carRepository.save(car);
    }

    public void update(CarDTO carDTO , UUID id){
        Car car = carRepository.findById(id).get();
        if(car != null)
            carRepository.save(car);
        else// do something
            System.out.println("....");
    }
}