package com.example.lesson43bl.repository;

import com.example.lesson43bl.model.CarEntity;
import com.example.lesson43bl.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<CarEntity,Integer> {

    List<CarEntity>findByType(Type type);
}
