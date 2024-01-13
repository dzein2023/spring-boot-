package com.example.demo1.Repositories;

import com.example.demo1.Domain.City;

import java.util.List;

public interface IcityRepository {
    City addCity(City c);
    City getCityById(Long id);
    List<City> getAllCities();

    void createCityTable();
}
