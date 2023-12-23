package com.example.store.service.impl;

import com.example.store.dto.CarDto;
import com.example.store.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class StoreServiceImpl implements StoreService {
    private final RestTemplate template;
    @Override
    public CarDto register(CarDto dto) {
        var responseEntity = template.postForEntity("127.0.0.1:8071/cars", dto, CarDto.class);
        return responseEntity.getBody();
    }
}
