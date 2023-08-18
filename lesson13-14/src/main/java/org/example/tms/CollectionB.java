package org.example.tms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionB {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("");
        students.add("Олег");
        students.add("Федор");
        students.add("Коля");
        students.add("Надя");
        students.add("Вита");
        students.add("антон");
        students.add("Зина");
        students.add("Кирилл");
        students.add("Олег");
        students.add("Ульяна");
        students.add("Алёна");
        students.add("Сергей");
        students.add("Нина");
        students.add("Женя");
        students.add("Аня");

        // Вернуть количество количество людей с вашим именем
        long count = students.stream()
                .filter(name -> name.equalsIgnoreCase("Олег"))
                .count();
        System.out.println("Количество людей с именем Олег: " + count);

        List<String> nameA=students.stream()
                .filter(name->name.toLowerCase().startsWith("а"))
                .collect(Collectors.toList());
        System.out.println("Люди с именами начинающимися на 'а': " + nameA);

        students.stream()
                .findFirst()
                .ifPresent(name-> System.out.println("Первое имя в списке:"+name));



    }
}

