package org.example;

import java.io.*;
import java.util.Scanner;

public class DocReader {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите путь к файлу:");
            String path = scanner.nextLine();
            LineNumberReader reader = new LineNumberReader(new BufferedReader(new FileReader(path)));
            String s = reader.readLine();


            try {
                while (s != null) {
                    if (s.length()!=15){
                        throw new RuntimeException("Invalid file lenght");
                    }
                    if (!s.startsWith("docnum") && !s.startsWith("contract")){
                        throw new RuntimeException("Invalid file prefix");
                    }
                    System.out.println(s);
                    s = reader.readLine();
                }
            }finally {
                reader.close();
            }
        }
        catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}



