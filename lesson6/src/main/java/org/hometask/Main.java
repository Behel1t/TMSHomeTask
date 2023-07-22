/*
1. Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
периметра.
Создать массив из 5 фигур.
Вывести на экран сумму периметра всех фигур в массиве.
 */
package org.hometask;

public class Main {
    public static void main(String[] args) {
        Figure[] figures=new Figure[5];
        figures[0]=new Circle(30);
        figures[1]=new Triangle(12,3,5);
        figures[2]=new Rectangle(6,5);
        figures[3]=new Circle(6);
        figures[4]=new Rectangle(5,5);

        int result=0;
        for (Figure figure:figures){
            double perimetr=figure.perimetr();
            result+=perimetr;
        }
        System.out.println(result);

    }

}
