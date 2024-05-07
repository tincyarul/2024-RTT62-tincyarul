package org.example.PA_303_7_1_Arrays;
//Task 3: Write a program that creates an array of String type and initializes it with the
//strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy
//using the clone( ) method. Use the Arrays.toString( ) method on the new array to
//verify that the original array was copied.

import java.util.Arrays;

public class Task3Array {
    public static void main(String[] args) {
        // Create an array of String type and initialize it with the given strings
        String[] colors = {"red", "green", "blue", "yellow"};

        // Print out the array length
        System.out.println("Original array length: " + colors.length);

        // Make a copy of the array using the clone() method
        String[] copiedColors = colors.clone();

        // Use Arrays.toString() method to print out the copied array
        System.out.println("Copied array: " + Arrays.toString(copiedColors));
    }
}
