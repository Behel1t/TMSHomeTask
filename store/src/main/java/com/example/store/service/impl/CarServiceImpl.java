package com.example.store.service.impl;

import com.example.store.client.CarClient;
import com.example.store.dto.CarDto;
import com.example.store.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {
    private final CarClient client;

    @Override
    public CarDto register(CarDto dto) {
        return  client.save(dto);
    }

    @Override
    public List<CarDto> find() {
        return client.find();
    }

    @Override
    public CarDto find(Integer id) {
        return client.find(id);
    }
}
