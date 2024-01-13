package com.example.demo1.Repositories;

import com.example.demo1.Domain.City;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
@Component
public class CityRepository implements IcityRepository {
    private  JdbcTemplate jdbcTemplate;
    private final RowMapper<City> rowMapper;

    public CityRepository(JdbcTemplate jdbcTemplate, RowMapper<City> rowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
    }

    @Override
    public City addCity(City c) {
        PreparedStatementCreator preparedStatementCreator =(Connection connection)->{
            PreparedStatement preparedStatement =connection.prepareStatement("INSERT INTO cities(name) " +
                    "values(?)");
            preparedStatement.setString(1,c.getName());
            return preparedStatement;
        } ;
        jdbcTemplate.update(preparedStatementCreator);
        return c;
    }

    @Override
    public City getCityById(Long id) {
        String q = "select * from cities where id="+id;
        return jdbcTemplate.queryForObject(q,rowMapper);
    }

    @Override
    public List<City> getAllCities() {
        return null;
    }

    @Override
    public void createCityTable() {
        String q = "Create table if not Exists cities(id bigint not NULL  Generated always as identity" +
                ", name varchar(255))";
        this.jdbcTemplate.update(q);

    }
}
