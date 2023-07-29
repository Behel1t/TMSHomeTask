package org.tms.lessons;

public class Worker extends Employee{
    public Worker(String firstName, String lastName, int experience) {
        super(firstName, lastName, experience, Position.WORKER);
    }

    @Override
    public double calculateSalary() {
        return 1000 * getPosition().getCoefficient() * getExperience();
    }
}


