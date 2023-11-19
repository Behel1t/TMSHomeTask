package org.example.config;

import org.example.domain.UserEntity;
import org.example.domain.TaskEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
    private static SessionFactory sessionFactory;
    static {
        sessionFactory  = new Configuration()
                .addAnnotatedClass(UserEntity.class)
                .addAnnotatedClass(TaskEntity.class)
                .setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/hibpersons")
                .setProperty("hibernate.connection.username", "postgres")
                .setProperty("hibernate.connection.password", "postgres")
                .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
                .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect")
                .setProperty("hibernate.show_sql", "true")
                .setProperty("hibernate.hbm2ddl.auto", "create-drop")
                .buildSessionFactory();
    }
    public static Session createSession() {
        return sessionFactory.openSession();
    }
}
