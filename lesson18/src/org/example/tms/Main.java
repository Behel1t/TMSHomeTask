package org.example.tms;

import org.example.tms.domain.Students;

import java.sql.SQLException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws  SQLException {
        StudentsService service=new StudentsService();
        List<Students>all=service.findAll();

        System.out.println(all);

    }
}