/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Display the original sentence
        System.out.println("Original sentence: " + sentence);
        
        // 1. Convert the sentence to all uppercase letters
        String upperCaseSentence = sentence.toUpperCase();
        System.out.println("Uppercase sentence: " + upperCaseSentence);
        
        // 2. Count the number of words in the sentence
        String[] words = sentence.split("\\s+");  // Split the sentence by spaces
        int wordCount = words.length;
        System.out.println("Word count: " + wordCount);
        
        // 3. Reverse the entire sentence
        String reversedSentence = new StringBuilder(sentence).reverse().toString();
        System.out.println("Reversed sentence: " + reversedSentence);
        
        // 4. Check if the sentence contains the word "Java" (case-insensitive)
        boolean containsJava = sentence.toLowerCase().contains("java");
        System.out.println("Contains 'Java' (case-insensitive): " + containsJava);
        
        // 5. Replace spaces in the sentence with underscores
        String replacedSentence = sentence.replace(" ", "_");
        System.out.println("Sentence with spaces replaced by underscores: " + replacedSentence);
        
        
        scanner.close();
    }
}
