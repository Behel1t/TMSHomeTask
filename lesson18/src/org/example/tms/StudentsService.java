package org.example.tms;

import org.example.tms.config.DataBaseConnectionConfig;
import org.example.tms.domain.Students;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsService {
    public List<Students> findAll() throws SQLException {
        Connection connection = DataBaseConnectionConfig.getConnection();
        Statement statement= connection.createStatement();
        ResultSet resultSet = statement.executeQuery( "select *from students");

        return createFromResultSet(resultSet);

    }
    private List<Students> createFromResultSet(ResultSet resultSet) throws SQLException {
        List<Students> studentsList=new ArrayList<>();
        while (resultSet.next()){
            int id= resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            int age = resultSet.getInt("age");
            String team = resultSet.getString("team");
            String city=resultSet.getString("city");

            Students students=new Students(id,firstName,lastName,age,team,city);
            studentsList.add(students);
        }
    return studentsList;
    }
}
