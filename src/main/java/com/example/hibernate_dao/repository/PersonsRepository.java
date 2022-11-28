package com.example.hibernate_dao.repository;

import com.example.hibernate_dao.entity.Persons;

import java.util.List;

public interface PersonsRepository {
    List<Persons> getPersonsByCity(String city);
}
