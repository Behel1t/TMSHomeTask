package org.example;

import org.example.entity.Model;
import org.example.entity.PersonEntity;
import org.example.entity.PhoneEntity;
import org.example.service.PersonService;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        PersonService service = new PersonService();

        PhoneEntity phone = PhoneEntity.builder()
                .time(new Date())
                .onStock(false)
                .build();
        var phoneSaved=service.save(phone);

        PersonEntity person = PersonEntity.builder()
                .name("Tyler")
                .model(Model.IPHONE)
                .build();
        var personSaved=service.save(person);
        PersonEntity byId = service.getById(personSaved);
        System.out.println(byId);


    }
}