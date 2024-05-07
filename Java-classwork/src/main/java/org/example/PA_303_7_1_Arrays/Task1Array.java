package org.example.PA_303_7_1_Arrays;
//Task 1: Write a program that creates an array of integers with a length of 3. Assign
//the values 1, 2, and 3 to the indexes. Print out each array element

public class Task1Array {
    public static void main(String[] args) {
        // Create an array of integers with a length of 3
        int[] array = new int[3];

        // Assign the values 1, 2, and 3 to the indexes
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        // Print out each array element
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }

}
