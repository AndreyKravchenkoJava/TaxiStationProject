package com.example.taxistationsystem.TaxiStationSystemProject.TaxiStationProject.controllers;

import com.example.taxistationsystem.TaxiStationSystemProject.TaxiStationProject.entity.Car;
import com.example.taxistationsystem.TaxiStationSystemProject.TaxiStationProject.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/cars")
    public Car saveCar(@Valid @RequestBody Car car) {
        return carService.saveCar(car);
    }

    @GetMapping("/cars")
    public List<Car> fetchCarList() {
        return carService.fetchCarList();
    }

    @PutMapping("/cars/{id}")
    public Car updateCar(@RequestBody Car car, @PathVariable("id") Long carId) {
        return carService.updateCar(car, carId);
    }

    @DeleteMapping("/cars/{id}")
    public String deleteCarById(@PathVariable("id") Long caId) {
        carService.deleteCarById(caId);
        return "Deleted Successfully";
    }

    @GetMapping("/cars/price")
    public int priceAllPark() {
        return carService.priceAllPark();
    }

}
