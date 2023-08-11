package org.example;

import java.io.*;
import java.util.Scanner;

public class DocReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        String path = scanner.nextLine();
        try (LineNumberReader reader = new LineNumberReader(new BufferedReader(new FileReader(path)));
             Writer inValid = new FileWriter("/Users/Oleg/Desktop/inValid.txt", false);
             Writer valid = new FileWriter("/Users/Oleg/Desktop/Valid.txt",true)) {
            String s = reader.readLine();
            while (s != null) {
                if (s.length() != 15) {
                    inValid.write("\nInvalid file's  length, must be 15 symbols but was " + s);
                    System.out.println("Invalid file's  length");

                }
                else if (!s.startsWith("docnum") && !s.startsWith("contract")) {
                    inValid.write("\nInvalid file's  name, must be 'docnum' or 'contract' prefix but was " + s);
                    System.out.println("Invalid file's name ");

                }
                else {
                valid.write("\n"+s);

                }
            }
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}



