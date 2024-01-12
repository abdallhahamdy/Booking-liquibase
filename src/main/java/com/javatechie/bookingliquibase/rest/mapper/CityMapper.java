package com.javatechie.bookingliquibase.rest.mapper;

import com.javatechie.bookingliquibase.entity.City;
import com.javatechie.bookingliquibase.rest.dto.CityDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.*;

import java.util.List;

@Mapper
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mappings({
            @Mapping(source = "name", target = "cityName")
    })
    CityDto cityToCityDTO(City city);

    List<CityDto> citiesToCityDTOs(List<City> cities);

}