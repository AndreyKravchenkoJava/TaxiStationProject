package com.example.taxistationsystem.TaxiStationSystemProject.TaxiStationProject.repository;

import com.example.taxistationsystem.TaxiStationSystemProject.TaxiStationProject.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
}
