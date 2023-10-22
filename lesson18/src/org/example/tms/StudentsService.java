package org.example.tms;

import org.example.tms.config.DataBaseConnectionConfig;
import org.example.tms.domain.Students;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsService {
    private Students city;

    public List<Students> findAll() throws SQLException {
        Connection connection = DataBaseConnectionConfig.getConnection();
        Statement statement= connection.createStatement();
        ResultSet resultSet = statement.executeQuery( "select *from students join city  on students.city_id = city.id;");
        return createFromResultSet(resultSet);
    }
    private List<Students> createFromResultSet(ResultSet resultSet) throws SQLException {
        List<Students> studentsList = new ArrayList<>();
        int id = 0;
        while (resultSet.next()) {
            id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            int age = resultSet.getInt("age");
            String team = resultSet.getString("team");
            String city = resultSet.getString("city");

            Students students = new Students(id, firstName, lastName, age, team, city);
            studentsList.add(students);

        }
        // Добавление нового города
        Connection connection = DataBaseConnectionConfig.getConnection();
        Statement statement= connection.createStatement();
        PreparedStatement addCityStatement = connection.prepareStatement("update city set city=? where id=?");
        addCityStatement.setString(1, "Новосибирск");
        addCityStatement.setInt(2,3);

        addCityStatement.executeUpdate();
        // Добавление нового студента
        PreparedStatement preparedStatement = connection.prepareStatement("update students set first_name=?, last_name=? ,age=?, team=?, city_id=? where id=?");
        preparedStatement.setString(1, "Miller");
        preparedStatement.setString(2,"Veg");
        preparedStatement.setInt(3,25);
        preparedStatement.setString(4,"120C");
        preparedStatement.setInt(5,4);
        preparedStatement.setInt(6, 5);

        preparedStatement.executeUpdate();
        // Удаление студента
        PreparedStatement deleteStudentStatement = connection.prepareStatement("DELETE FROM students WHERE id = ?");
        deleteStudentStatement.setInt(1, 5);
        deleteStudentStatement.executeUpdate();
        // Удаление города
        PreparedStatement deleteCityStatement = connection.prepareStatement("DELETE FROM city WHERE id = ?");
        deleteCityStatement.setInt(1, 1);
        deleteCityStatement.executeUpdate();

        connection.close();

        return studentsList;
    }

}
