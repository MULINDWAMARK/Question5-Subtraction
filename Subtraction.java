/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.subtraction;

import java.util.Random;
import java.util.Scanner;


/**
 * A program to help a mathematics student practice subtraction.
 */
public class Subtraction {

    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Generate two single-digit integers
        int number1 = random.nextInt(10); // Random number between 0 and 9
        int number2 = random.nextInt(10); // Random number between 0 and 9

        // Ensure number1 >= number2, swap if necessary
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student with the subtraction question
        System.out.println("What is " + number1 + " - " + number2 + "?");

        // Create a Scanner object to read the student's answer
        Scanner scanner = new Scanner(System.in);

        // Read the student's answer
        int studentAnswer = scanner.nextInt();

        // Calculate the correct answer
        int correctAnswer = number1 - number2;

        // Check if the student's answer is correct and display the result
        if (studentAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
        }

        // Close the scanner
        scanner.close();
    }
}
