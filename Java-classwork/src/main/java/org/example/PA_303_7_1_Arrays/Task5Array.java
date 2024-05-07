package org.example.PA_303_7_1_Arrays;
//Task 5: Write a program where you create an integer array with a length of 5. Loop
//through the array and assign the value of the loop control variable (e.g., i) to the
//corresponding index in the array

public class Task5Array {
    public static void main(String[] args) {
        // Create an integer array with a length of 5
        int[] array = new int[5];

        // Loop through the array and assign the value of the loop control variable to the corresponding index
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Print out the array to verify the assignment
        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }
}
