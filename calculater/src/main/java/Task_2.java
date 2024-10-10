/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 44773
 */

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        // take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // the original sentence
        System.out.println("Original sentence: " + sentence);
        
        // 1. uppercase letters
        String upperCaseSentence = sentence.toUpperCase();
        System.out.println("Uppercase sentence: " + upperCaseSentence);
        
        // 2. Count the number of words
        String[] words = sentence.split("\\s+"); 
        int wordCount = words.length;
        System.out.println("Word count: " + wordCount);
        
        // 3. Reverse
        String reversedSentence = new StringBuilder(sentence).reverse().toString();
        System.out.println("Reversed sentence: " + reversedSentence);
        
        // 4. Check if the sentence (case-insensitive)
        boolean containsJava = sentence.toLowerCase().contains("java");
        System.out.println("Contains 'Java' (case-insensitive): " + containsJava);
        
        // 5. Replace all spaces in the sentence with underscores
        String replacedSentence = sentence.replace(" ", "_");
        System.out.println("Sentence with spaces replaced by underscores: " + replacedSentence);
        
        
        scanner.close();
    }
}
