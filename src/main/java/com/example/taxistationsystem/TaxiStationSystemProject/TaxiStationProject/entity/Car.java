package com.example.taxistationsystem.TaxiStationSystemProject.TaxiStationProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "BRAND")
    private String brand;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "PRICE")
    private int price;
    @Column(name = "CONSUMPTION")
    private int fuelConsumption;
    @Column(name = "SPEED")
    private int maxSpeed;
    @Column(name = "SEATS")
    private int numbersOfSeats;

}
