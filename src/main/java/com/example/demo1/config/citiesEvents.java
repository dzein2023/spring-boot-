package com.example.demo1.config;

import com.example.demo1.Domain.City;
import com.example.demo1.Repositories.CityRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class citiesEvents {
    private final CityRepository cityRepository;

    public citiesEvents(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    @EventListener(ApplicationReadyEvent.class)
    public void setCityRepositoryBackGround()
    {
        City c = new City("jerusalem");
        System.out.println("create table  cities");
        cityRepository.createCityTable();
        System.out.println("add city");
        System.out.println(cityRepository.addCity(c));
        System.out.println("get city by Id");
        System.out.println(cityRepository.getCityById(1L));

    }
}
