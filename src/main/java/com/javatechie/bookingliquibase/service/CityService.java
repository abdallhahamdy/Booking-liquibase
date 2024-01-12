package com.javatechie.bookingliquibase.service;


import com.javatechie.bookingliquibase.entity.City;
import com.javatechie.bookingliquibase.repository.CityRepository;
import com.javatechie.bookingliquibase.rest.dto.CityDto;
import com.javatechie.bookingliquibase.rest.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<CityDto> getAllCities() {
        List<City> cities = cityRepository.findAll();
        return CityMapper.INSTANCE.citiesToCityDTOs(cities);
    }

}