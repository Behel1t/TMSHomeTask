package org.tms.lessons;

public abstract class Employee {
    private String firstName;
    private String  lastName;
    private int experience;
    private Position position;

    public Employee(String firstName, String lastName, int experience, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.position = position;
    }

    public abstract double calculateSalary();

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

