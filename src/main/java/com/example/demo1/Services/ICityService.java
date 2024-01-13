package com.example.demo1.Services;

import com.example.demo1.Domain.City;

import java.util.List;

public interface ICityService {
    City addCity(City c);
    City getCityById(Long id);
    List<City> getAllCities();

}
