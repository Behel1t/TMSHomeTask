package org.example.service;

import org.example.HibernateConfig;
import org.example.entity.PersonEntity;
import org.example.entity.PhoneEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.UUID;

public class PersonService {
    public Integer save(PersonEntity person){
        Session session= HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        Integer  saved =(Integer) session.save(person);

        transaction.commit();
        session.close();
        return saved;
    }
    public UUID save(PhoneEntity phone){

        Session session= HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UUID  saved =(UUID) session.save(phone);

        transaction.commit();
        session.close();
        return saved;
    }
    public PersonEntity getById(Integer personId){

        Session session= HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        PersonEntity person = session.find(PersonEntity.class, personId);
        System.out.println(person);

        transaction.commit();
        session.close();
        return person;
    }
}
