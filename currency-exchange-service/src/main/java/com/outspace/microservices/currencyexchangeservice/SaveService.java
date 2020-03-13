package com.outspace.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
@Transactional
public class SaveService {

    @Autowired
    EntityManager entityManager;

    public void insert(ExchangeValue value) {
        entityManager.persist(value);

    }
}
