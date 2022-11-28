package com.example.hibernate_dao.repository;

import com.example.hibernate_dao.entity.Persons;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ImplPersonsRepository implements PersonsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Persons> getPersonsByCity(String city) {
        Query query = entityManager.createQuery("select p from Persons p where p.cityOfLiving = :city");
        query.setParameter("city", city);
        return query.getResultList();
    }
}


