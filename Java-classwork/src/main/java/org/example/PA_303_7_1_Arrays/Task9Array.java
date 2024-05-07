package org.example.PA_303_7_1_Arrays;
//● Task 9:
//Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1,
//0}. Print the array in ascending order, and print the smallest and the largest
//element of the array. The output will look like the following:
//Array in ascending order: 0, 1, 2, 4, 9, 13
//The smallest number is 0
//The biggest number is 13

//ArraySortingExample

import java.util.Arrays;

public class Task9Array {
    public static void main(String[] args) {
        // Define the int array
        int[] array = {4, 2, 9, 13, 1, 0};

        // Sort the array in ascending order
        Arrays.sort(array);

        // Print the sorted array in ascending order
        System.out.print("Array in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Print the smallest number
        System.out.println("The smallest number is " + array[0]);

        // Print the biggest number
        System.out.println("The biggest number is " + array[array.length - 1]);
    }

}
