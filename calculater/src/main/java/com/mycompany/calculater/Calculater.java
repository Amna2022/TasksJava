/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculater;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

    
        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        //store the result
        double result = 0;

      
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
                    return; 
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
                return; 
        }

        
        System.out.println("The result is: " + result);

        // Close the scanner
        scanner.close();
    }
}
