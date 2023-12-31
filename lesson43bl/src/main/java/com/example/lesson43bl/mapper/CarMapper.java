package com.example.lesson43bl.mapper;

import com.example.lesson43bl.dto.CarDto;
import com.example.lesson43bl.model.CarEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDto toDto(CarEntity entity);

    CarEntity toEntity(CarDto dto) ;


    List<CarDto> toDtos(List<CarEntity> entities);

    @Mapping(target = "id", ignore = true)
    default void update(@MappingTarget CarEntity entity, CarDto dto) {

    }
}
