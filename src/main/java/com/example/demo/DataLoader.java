package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;
    @Override
    public void run(String... args) throws Exception{
        Car car = new Car(2008, "Toyota",
                "Prius");
        repository.save(car);


        car = new Car(2005, "Toyota", "Tacoma");
        repository.save(car);

        car = new Car(2002, "Toyota",
                "Camry");
        repository.save(car);


    }
}
