package org.example.PA_303_7_1_Arrays;
//write a program where you create an array of 5 elements. Loop through the
//array and print the value of each element, except for the middle (index 2) element.

public class Task7Array {
    public static void main(String[] args) {
        // Create an array of 5 elements
        int[] array = {10, 20, 30, 40, 50};

        // Loop through the array and print the value of each element, except for the middle (index 2) element
        for (int i = 0; i < array.length; i++) {
            if (i != 2) {
                System.out.println("Element at index " + i + ": " + array[i]);
            }
        }

    }
}