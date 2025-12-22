package com.nit.exception;

import java.util.Scanner;

public class Exception4 {

    // Constructor
    public Exception4(String className) {
        try {
            Class<String> c =(Class<String>)Class.forName(className);
            System.out.println("Class loaded successfully: " + c.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Class '" + className + "' not found.");
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the class name to load: ");
        String name = sc.nextLine();
 
        new Exception4(name);

        sc.close();
    }
}
