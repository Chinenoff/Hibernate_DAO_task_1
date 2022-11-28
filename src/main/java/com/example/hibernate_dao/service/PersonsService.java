package com.example.hibernate_dao.service;

import com.example.hibernate_dao.entity.Persons;
import com.example.hibernate_dao.repository.PersonsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonsService {

    private final PersonsRepository personsRepository;


    public PersonsService(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    public List<Persons> getPersonsByCity(String cityName) {
        return personsRepository.getPersonsByCity(cityName);
    }


}
