package com.outspace.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;


public class DataInitializer {

    @Autowired
    SaveService service;


    public void initData() {
        ExchangeValue test = new ExchangeValue(10004L,"RU", "ENG", BigDecimal.valueOf(0));
        ExchangeValue test1 = new ExchangeValue(10005L,"UK", "FR", BigDecimal.valueOf(0));
        service.insert(test);
        service.insert(test1);
        System.out.println("TEST " + test);
    }
}
