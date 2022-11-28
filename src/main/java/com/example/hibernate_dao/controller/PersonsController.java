package com.example.hibernate_dao.controller;

import com.example.hibernate_dao.entity.Persons;
import com.example.hibernate_dao.service.PersonsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/persons")
public class PersonsController {

    private final PersonsService personsService;


    public PersonsController(PersonsService personsService) {
        this.personsService = personsService;
    }

    @RequestMapping("/by-city")
    public List<Persons> getByCity(@RequestParam Map<String, String> city) {
        return personsService.getPersonsByCity(city.get("city"));
    }
}