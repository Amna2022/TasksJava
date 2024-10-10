/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 44773
 */

import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        
        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        
        double result = 0;

        // Perform the calculation based on the selected operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit if division by zero occurs
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
                return; // Exit if an invalid operation is chosen
        }

        // Display the result 
        System.out.println("The result is: " + result);

        
        scanner.close();
    }
}
