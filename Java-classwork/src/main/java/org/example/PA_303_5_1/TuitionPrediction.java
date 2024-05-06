package org.example.PA_303_5_1;

public class TuitionPrediction {
    public static void main(String[] args) {
        double initialTuition = 10000; // Initial tuition
        double targetTuition = initialTuition * 2; // Target tuition (double of initial tuition)
        double tuition = initialTuition; // Current tuition
        int years = 0; // Number of years

        // Calculate tuition for each year until it becomes double the initial tuition
        while (tuition < targetTuition) {
            tuition *= 1.07; // Increase tuition by 7 percent each year
            years++; // Increment the number of years
        }

        // Display the result
        System.out.println("In " + years + " years, the tuition will be doubled.");
    }
}
