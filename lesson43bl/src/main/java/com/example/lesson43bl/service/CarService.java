package com.example.lesson43bl.service;

import com.example.lesson43bl.dto.CarDto;
import com.example.lesson43bl.dto.SearchDto;

import java.util.List;

public interface CarService {
    List<CarDto> findAll();
    CarDto find(Integer id);
    CarDto update(Integer id,CarDto dto);
    CarDto save(CarDto dto);
    void delete(Integer id);
    CarDto buy(Integer id);
    List<CarDto>find(SearchDto dto);
    CarDto findByName(String name);
}
