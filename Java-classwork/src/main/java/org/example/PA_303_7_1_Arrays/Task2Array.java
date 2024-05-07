package org.example.PA_303_7_1_Arrays;
//Task 2: Write a program that returns the middle element in an array. Give the following
//values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

public class Task2Array {
    public static void main(String[] args) {
        // Define the integer array
        int[] array = {13, 5, 7, 68, 2};

        // Call the method to find and print the middle element
        int middleElement = findMiddleElement(array);
        System.out.println("Middle element: " + middleElement);
    }

    // Method to find the middle element in an array
    public static int findMiddleElement(int[] array) {
        // Check if the array length is odd or even
        if (array.length % 2 == 0) {
            // If the array length is even, there is no single middle element
            // Return -1 or throw an exception to handle this case
            return -1; // Alternatively, throw new IllegalArgumentException("Array length is even");
        } else {
            // If the array length is odd, find the middle element
            int middleIndex = array.length / 2;
            return array[middleIndex];
        }
    }
}
