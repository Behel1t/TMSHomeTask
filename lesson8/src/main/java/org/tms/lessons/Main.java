package org.tms.lessons;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", "Doe", 3);
        Worker worker2 = new Worker("Jane", "Doe", 5);
        Worker worker3 = new Worker("Bob", "Smith", 2);
        Director director1 = new Director("Alice", "Johnson", 10);

        System.out.println(worker1.getFullName() + ", з/п: " + worker1.calculateSalary());
        System.out.println(worker2.getFullName() + ", з/п: " + worker2.calculateSalary());
        System.out.println(worker3.getFullName() + ", з/п: " + worker3.calculateSalary());
        System.out.println(director1.getFullName() + ", з/п: " + director1.calculateSalary());

        director1.addSubordinate(worker1);
        director1.addSubordinate(worker2);

        System.out.println("Директор " + director1.getFullName() + " управляет:");
        for (Employee employee : director1.getSubordinates()) {
            System.out.println("- " + employee.getFullName() + ", должность: " + employee.getPosition());
        }

        Director director2 = new Director("Mike", "Brown", 8);
        director1.addSubordinate(director2);
        director2.addSubordinate(worker3);

        System.out.println("Директор " + director1.getFullName() + " управляет:");
        for (Employee employee : director1.getSubordinates()) {
            System.out.println("- " + employee.getFullName() + ", должность: " + employee.getPosition());
            if (employee instanceof Director) {
                System.out.println("  под управлением:");
                for (Employee subordinate : ((Director) employee).getSubordinates()) {
                    System.out.println("  - " + subordinate.getFullName() + ", должность: " + subordinate.getPosition());
                }
            }
        }
        System.out.println("Поиск сотрудника по имени:");
        System.out.println(findEmployee(director1, "Bob"));
    }

    public static boolean findEmployee(Employee employee, String name) {
        if (employee.getFullName().equals(name)) {
            return true;
        } else if (employee instanceof Director) {
            for (Employee subordinate : ((Director) employee).getSubordinates()) {
                if (findEmployee(subordinate, name)) {
                    return true;
                }
            }
        }
        return false;
    }
}