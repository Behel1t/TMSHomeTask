package org.example;

public class Singleton {
        private static Singleton instance ;

        private Singleton() {
            System.out.println("Singleton");
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
}
