package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the Fahrenheit:");
                    fahrenheit = input.nextInt();
                    celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.println("The C is " + celsius);
                    break;
                case 2:
                    System.out.println("Enter the Celsius:");
                    celsius = input.nextInt();
                    fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println("The F is " + fahrenheit);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }

        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.00 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.000 / 9) * (fahrenheit - 32);
    }
}
