package org.example.PA_303_7_1_Arrays;
//Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
//The numbers can be any integers. Print out the value at the first index and the last
//index using length - 1 as the index. Now try printing the value at index = length (e.g.,
//myArray[myArray.length] ). Notice the type of exception which is produced. Now try
//to assign a value to the array index 5. You should get the same type of exception.

public class Task4Array {
    public static void main(String[] args) {
        // Create an integer array with 5 elements
        int[] numbers = {10, 20, 30, 40, 50};

        // Print out the value at the first index
        System.out.println("Value at first index: " + numbers[0]);

        // Print out the value at the last index using length - 1 as the index
        System.out.println("Value at last index: " + numbers[numbers.length - 1]);

        try {
            // Try printing the value at index = length
            System.out.println("Value at index = length: " + numbers[numbers.length]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Try assigning a value to the array index 5
            numbers[5] = 60; // This will also throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
