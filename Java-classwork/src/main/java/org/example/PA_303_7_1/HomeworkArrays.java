package org.example.PA_303_7_1;

import java.util.Random;

public class HomeworkArrays {
    public static void main(String[] args) {
        // Create an int array of length 10
        int[] array = new int[10];

        // Initialize the array to random integers
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Generates random integers between 0 and 99
        }

        // Get the smallest integer in the array
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Get the largest integer in the array
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Calculate the average value in the array as a double
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        double average = (double) sum / array.length;

        // Print the results
        System.out.println("Smallest integer in the array: " + smallest);
        System.out.println("Largest integer in the array: " + largest);
        System.out.println("Average value in the array: " + average);
    }
}
