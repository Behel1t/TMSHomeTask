package com.example.store.service;

import com.example.store.dto.CarDto;

import java.util.List;

public interface CarService {
    CarDto register(CarDto dto);

    List<CarDto> find();

    CarDto find(Integer id);
}
