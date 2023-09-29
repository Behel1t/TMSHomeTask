package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private UUID id;
    private String year;
    private String model;
    private Integer price;
    private String brand;}


