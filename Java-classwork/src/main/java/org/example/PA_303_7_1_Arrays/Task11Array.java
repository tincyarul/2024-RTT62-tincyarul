package org.example.PA_303_7_1_Arrays;
//Task 11: Write some Java code that asks the user how many favorite things they
//have. Based on their answer, you should create a String array of the correct size.
//Then ask the user to enter the things and store them in the array you created. Finally,
//print out the contents of the array.
//Example
//How many favorite things do you have?
//7
//Enter your thing: phone
//Enter your thing: tv
//Enter your thing: xbox
//Enter your thing: wine
//Enter your thing: beer
//Enter your thing: sofa
//Enter your thing: book
//Your favorite things are:
//phone tv xbox wine beer sofa book

//Favourite Things

import java.util.Scanner;

public class Task11Array {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ask the user how many favorite things they have
    System.out.println("How many favorite things do you have?");
    int numberOfThings = scanner.nextInt();
    scanner.nextLine(); // Consume newline character

    // Create a String array of the correct size based on the user's answer
    String[] favoriteThings = new String[numberOfThings];

    // Ask the user to enter their favorite things and store them in the array
    System.out.println("Enter your favorite things:");
    for (int i = 0; i < numberOfThings; i++) {
        System.out.print("Enter your thing: ");
        favoriteThings[i] = scanner.nextLine();
    }

    // Print out the contents of the array
    System.out.println("Your favorite things are:");
    for (String thing : favoriteThings) {
        System.out.println(thing);
    }

    // Close the scanner
    scanner.close();
}
    
}
