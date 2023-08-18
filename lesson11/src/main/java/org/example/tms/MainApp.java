package org.example.tms;

public class MainApp {
    public static void main(String[] args) {

        MyCollection<Car>carMyCollection=new MyCollectionImpl<>();
        carMyCollection.add(new Car("red",2000,400));
        MyCollection<Plane>planeMyCollection=new MyCollectionImpl<>();
        planeMyCollection.add(new Plane("white",46700,2334));
        System.out.println(carMyCollection);
        System.out.println(planeMyCollection);
    }
}

