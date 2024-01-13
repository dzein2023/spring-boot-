package com.example.demo1.Services;


import com.example.demo1.Domain.City;
import com.example.demo1.Repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    public final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }


    @Override
    public City addCity(City c) {
        return cityRepository.addCity(c);
    }

    @Override
    public City getCityById(Long id) {
        return null;
    }

    @Override
    public List<City> getAllCities() {
        return null;
    }
}