package com.example.restful2.Restful2.filtering;

import com.example.restful2.Restful2.User;
import com.example.restful2.Restful2.UserService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaticFilteringController
{
    @Autowired
    private StaticFilterService service;

    @GetMapping("/static-filter")
    public List<StaticFilter> findAllUsers()
    {
        return service.findAll();
    }
}