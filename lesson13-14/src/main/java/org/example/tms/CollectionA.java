package org.example.tms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CollectionA {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println("Исходный список: " + list);

        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Список без дубликатов: " + uniqueList);

        List<Integer> evenList = list.stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x >= 7 & x<=17)
                .collect(Collectors.toList());
        System.out.println("Четные элементы в диапазоне от 7 до 17: " + evenList);

        List<Integer> multiplyList=list.stream()
                .map(x -> x *2)
                .collect(Collectors.toList());
        System.out.println("Список, каждый элемент умноженный на 2: " + multiplyList);

        List<Integer> sortList=list.stream()
                .sorted(Comparator.naturalOrder())
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("Первые 4 отсортированных элемента: " + sortList);

        long count = list.stream().count();
        System.out.println("Количество элементов в стриме: " + count);

        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Среднее арифметическое всех чисел в стриме: " + average);

    }
}
