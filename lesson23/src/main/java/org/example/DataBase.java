package org.example;

import org.example.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class DataBase {
    private static List<Car> cars =new ArrayList<>();

    public void create(Car car){
        car.setId(UUID.randomUUID());
        cars.add(car);
    }
    public static List<Car> getByBrand(String brand){
        if (brand==null||brand.isBlank()){
            return cars;
        }

        return cars.stream()
                .filter(car -> brand.equals(car.getBrand()))
                .collect(Collectors.toList());
    }
    public void delete(UUID id){
        Optional<Car> first = cars.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst();
        first.ifPresent(car -> cars.remove(car));
    }
}
