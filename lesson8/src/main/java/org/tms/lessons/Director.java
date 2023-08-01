package org.tms.lessons;
import java.util.ArrayList;
import java.util.List;

    public class  Director extends Employee {
        private List<Employee> subordinates;

        public Director(String firstName, String lastName, int experience) {
            super(firstName, lastName, experience, Position.DIRECTOR);
            subordinates = new ArrayList<>();
        }

        @Override
        public double calculateSalary() {
            double salary = 1000 * getPosition().getCoefficient() * getExperience();
            salary += subordinates.size() * 500;
            return salary;
        }

        public void addSubordinate(Employee employee) {
            subordinates.add(employee);

        }

        public List<Employee> getSubordinates() {
            return subordinates;
        }
    }


