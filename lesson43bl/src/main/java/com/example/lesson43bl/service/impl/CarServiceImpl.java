package com.example.lesson43bl.service.impl;

import com.example.lesson43bl.dto.CarDto;
import com.example.lesson43bl.dto.SearchDto;
import com.example.lesson43bl.exc.StoreFailedException;
import com.example.lesson43bl.mapper.CarMapper;
import com.example.lesson43bl.repository.CarRepository;
import com.example.lesson43bl.service.CarService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
@Transactional
public class CarServiceImpl implements CarService {
    private final CarMapper mapper;
    private final CarRepository repository;
    @Override
    public List<CarDto> findAll() {
        return mapper
                .toDtos(repository.findAll());
    }

    @Override
    public CarDto find(Integer id) {
        var car=repository.findById(id)
                .orElseThrow(()-> new StoreFailedException("Car not found"));
        return mapper.toDto(car);
    }

    @Override
    public CarDto update(Integer id, CarDto dto) {
        var car=repository.findById(id)
                .orElseThrow(()-> new StoreFailedException("Car not found"));
        mapper.update(car,dto);
        return mapper.toDto(car);
    }

    @Override
    public CarDto save(CarDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public void delete(Integer id) {
        var car=repository.findById(id)
                .orElseThrow(()-> new StoreFailedException("Car not found"));
        repository.delete(car);
    }

    @Override
    public CarDto buy(Integer id) {
        var car=repository.findById(id)
                .orElseThrow(()-> new StoreFailedException("Car not found"));
        var count = car.getCount();
        if (count==null||count<1){
            throw new StoreFailedException("Car not exists in store");
        }
        car.setCount(count-1);
        return mapper.toDto(car);
    }

    @Override
    public List<CarDto> find(SearchDto dto) {
        var type = dto.getType();
        return mapper.toDtos(repository.findByType(type));
    }

    @Override
    public CarDto findByName(String name) {
        return mapper.toDto(repository.findByName(name)
                .orElseThrow(()-> new StoreFailedException("Car not found")));
    }
}
