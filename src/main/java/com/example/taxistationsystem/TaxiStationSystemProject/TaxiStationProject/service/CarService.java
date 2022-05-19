package com.example.taxistationsystem.TaxiStationSystemProject.TaxiStationProject.service;

import com.example.taxistationsystem.TaxiStationSystemProject.TaxiStationProject.entity.Car;

import java.util.List;

public interface CarService {

    Car saveCar(Car car);

    List<Car> fetchCarList();

    Car updateCar(Car car, Long carId);

    void deleteCarById(Long carId);
}
