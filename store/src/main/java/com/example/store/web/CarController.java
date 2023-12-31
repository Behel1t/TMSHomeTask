package com.example.store.web;

import com.example.store.dto.CarDto;
import com.example.store.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/store/cars")
public class CarController {
    private final CarService service;
    @PostMapping
    CarDto save(@RequestBody CarDto carDto){
        return service.register(carDto);
    }
    @GetMapping
    public List<CarDto> find(){
        return service.find();
    }
    @GetMapping("/{id}")
    public CarDto find(@PathVariable(name = "id") Integer id){
        return service.find(id);
    }
}
