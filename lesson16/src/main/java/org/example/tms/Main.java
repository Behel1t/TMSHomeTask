package org.example.tms;

public class Main {
    public static void main(String[] args) throws InterruptedException {
            Thread t1 = new Thread(() -> System.out.println("Thread 1"));
            Thread t2 = new Thread(() -> System.out.println("Thread 2"));
            Thread t3 = new Thread(() -> System.out.println("Thread 3"));

            t3.start();
            t3.join();

            t2.start();
            t2.join();

            t1.start();
            t1.join();
        }
    }