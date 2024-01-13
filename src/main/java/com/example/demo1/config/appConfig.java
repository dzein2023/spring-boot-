package com.example.demo1.config;

import com.example.demo1.Domain.City;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

@Configuration
public class appConfig {
    @Bean
    public RowMapper<City> citiesRowMapper()
    {
        System.out.println("inside  row mapper");
        Class<City> cityClass = City.class;
        return new BeanPropertyRowMapper<>(City.class);

    }
}
