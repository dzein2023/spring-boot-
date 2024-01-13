package com.example.demo1.config;

import com.example.demo1.Domain.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class cityMapper implements RowMapper<City> {
    @Override
    public City mapRow(ResultSet rs, int rowNum) throws SQLException {
        City c = new City();
        Long id = rs.getLong("id");
        String name =rs.getString("name");
        c.setId(id);
        c.setName(name);
        return c;
    }
}

