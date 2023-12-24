package com.example.store.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Type;

@Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class CarDto {
        private Integer id;

        private Type type;
        private String name;
        private Integer count;
        private Integer cost;


    }

