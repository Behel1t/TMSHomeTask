package com.example.lesson43bl.dto;

import com.example.lesson43bl.model.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
