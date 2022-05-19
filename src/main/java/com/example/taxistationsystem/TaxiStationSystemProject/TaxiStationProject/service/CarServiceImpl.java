package com.example.taxistationsystem.TaxiStationSystemProject.TaxiStationProject.service;

import com.example.taxistationsystem.TaxiStationSystemProject.TaxiStationProject.entity.Car;
import com.example.taxistationsystem.TaxiStationSystemProject.TaxiStationProject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> fetchCarList() {
        return (List<Car>) carRepository.findAll();
    }

    @Override
    public Car updateCar(Car car, Long carId) {
        Car carDB = carRepository.findById(carId).get();

        if (Objects.nonNull(car.getBrand()) && !"".equalsIgnoreCase(car.getBrand())) {
            carDB.setBrand(car.getBrand());
        }

        if (Objects.nonNull(car.getModel()) && !"".equalsIgnoreCase(car.getModel())) {
            carDB.setModel(car.getModel());
        }

        if (Objects.nonNull(car.getPrice()) && !"".equalsIgnoreCase(String.valueOf(car.getPrice()))) {
            carDB.setPrice(car.getPrice());
        }

        if (Objects.nonNull(car.getFuelConsumption()) && !"".equalsIgnoreCase(String.valueOf(car.getFuelConsumption()))) {
            carDB.setFuelConsumption(car.getFuelConsumption());
        }

        if (Objects.nonNull(car.getMaxSpeed()) && !"".equalsIgnoreCase(String.valueOf(car.getMaxSpeed()))) {
            carDB.setMaxSpeed(car.getMaxSpeed());
        }

        if (Objects.nonNull(car.getNumbersOfSeats()) && !"".equalsIgnoreCase(String.valueOf(car.getNumbersOfSeats()))) {
            carDB.setNumbersOfSeats(car.getNumbersOfSeats());
        }

        return carRepository.save(carDB);
    }

    @Override
    public void deleteCarById(Long carId) {
        carRepository.deleteById(carId);
    }
}
