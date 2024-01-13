package com.example.demo1.Controllers;

import com.example.demo1.Domain.City;
import com.example.demo1.Services.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ControllerCity {
    private final CityService cityService;


    public ControllerCity(CityService cityService) {
        this.cityService = cityService;
    }



}
