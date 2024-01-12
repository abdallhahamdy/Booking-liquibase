package com.javatechie.bookingliquibase.rest.controller;

import com.javatechie.bookingliquibase.rest.dto.CityDto;
import com.javatechie.bookingliquibase.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<CityDto> getAllCities() {
        return cityService.getAllCities();
    }

}
