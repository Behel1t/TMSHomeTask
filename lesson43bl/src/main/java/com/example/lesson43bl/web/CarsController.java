package com.example.lesson43bl.web;

import com.example.lesson43bl.dto.CarDto;
import com.example.lesson43bl.dto.SearchDto;
import com.example.lesson43bl.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
public class CarsController {
    private final CarService service;
    @PostMapping
    public CarDto save(@RequestBody CarDto dto){
        return service.save(dto);
    }
    @GetMapping
    public List<CarDto> find(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public CarDto find(@PathVariable(name = "id") Integer id){
        return service.find(id);
    }
    @PutMapping("/{id}")
    public CarDto update(@PathVariable(name = "id") Integer id,@RequestBody CarDto dto){

        return service.update(id,dto);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Integer id) {
        service.delete(id);
    }
    @PostMapping("/buy/{id}")
    public CarDto buy(@PathVariable(name = "id")Integer id){
        return service.buy(id);
    }
    @PostMapping("/find")
    public List<CarDto> find(@RequestBody SearchDto searchDto){
        return service.find(searchDto);
    }

}
