package com.example.store.client;

import com.example.lesson43bl.dto.CarDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "car-client",url = "http://127.0.0.1:8071",path = "/cars")
public interface CarClient {
    @PostMapping
    CarDto save(@RequestBody CarDto request);
    @GetMapping
    List<CarDto> find();
    @GetMapping("/{id}")
    CarDto find(@PathVariable(name = "id") Integer id);
}
