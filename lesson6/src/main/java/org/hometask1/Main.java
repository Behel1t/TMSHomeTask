package org.hometask1;
/*2. Создать классы "Директор", "Рабочий", "Бухгалтер".
        Реализовать интерфейс с методом, который печатает название
        должности и имплементировать этот метод в созданные классы.
 */
public class Main {
    public static void main(String[] args) {
        Director director=new Director();
        Accountant accountant=new Accountant();
        Worker worker=new Worker();
        director.printPositionName();
        accountant.printPositionName();
        worker.printPositionName();

        }
    }

