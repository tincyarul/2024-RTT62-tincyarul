package org.example.PA_303_7_1_Arrays;
//ask 8: Write a program that creates a String array of 5 elements and swaps the first
//element with the middle element without creating a new array.

//ArraySwapExample

public class Task8Array {
    public static void main(String[] args) {
        // Create a String array of 5 elements
        String[] array = {"one", "two", "three", "four", "five"};

        // Swap the first element with the middle element
        int middleIndex = array.length / 2;
        String temp = array[0];
        array[0] = array[middleIndex];
        array[middleIndex] = temp;

        // Print the array after swapping
        System.out.println("Array after swapping:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
