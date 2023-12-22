package org.example;

import org.example.config.HibernateConfig;
import org.example.domain.Status;
import org.example.domain.Type;
import org.example.domain.UserEntity;
import org.example.domain.TaskEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.example.domain.Status.NEW;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateConfig.createSession();
        Transaction transaction = session.beginTransaction();

        var user1= UserEntity.builder()
                .name("Nick")
                .type(Type.USER)
                .dateOfBirth("21.01.2000")
                .gender("male")
                .build();
        var user2= UserEntity.builder()
                .name("Ann")
                .type(Type.SUPPORT)
                .dateOfBirth("21.04.2001")
                .gender("female")
                .build();
        var task1= TaskEntity.builder()
                .title("Repair")
                .description("troubleshooting heating system")
                .status(Status.IN_PROGRESS)
                .build();
        var task2= TaskEntity.builder()
                .title("Сleaning")
                .description("workplace cleaning")
                .status(NEW)
                .build();
        var task3= TaskEntity.builder()
                .title("Сooking")
                .description("cooking delicious cookies ")
                .status(Status.IN_PROGRESS)
                .build();


        user1.addTask(task1);
        user1.addTask(task2);

        user2.addTask(task2);
        user2.addTask(task3);


        Integer savedId=(Integer) session.save(user1);
        session.save(user1);
        session.save(user2);


        transaction.commit();
        session.close();

        Session session1 = HibernateConfig.createSession();
        Transaction transaction1 = session1.beginTransaction();

        task3.setDescription("cooking delicious tea");
        session1.update(task3);

        Query query1 = session1.createQuery("from TaskEntity where status=0");
        List list=query1.list();
        list.forEach(o -> System.out.println(o));

        session1.delete(user1);
        session1.delete(user2);


        transaction1.commit();
        session1.close();


//        Session session2 = HibernateConfig.createSession();
//        Transaction transaction2 = session2.beginTransaction();
//
//        session2.delete(user1);
//        session2.delete(user2);
//
//        transaction2.commit();
//        session2.close();

    }
}