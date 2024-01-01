package com.example.lesson43bl.dto;

import com.example.lesson43bl.model.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchDto {
    private Type type;
}