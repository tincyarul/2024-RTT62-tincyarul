package org.example.PA_303_4_1_controlstt;
// Create a program that lets the users input their filing status and
//income. Display how much tax the user would have to pay
//according to status and income.
//❑ The U.S. federal personal income tax is calculated based
//on the filing status and taxable income.
//❑ There are four filing statuses: Single, Married Filing Jointly,
//Married Filing Separately, and Head of Household.
//❑ The tax rates for 2009 are shown below.

import java.util.Scanner;

public class program7_IncomeTaxCalaculator {
    public static void main(String[] args) {
        // Define tax brackets and rates for each filing status
        final double[] singleBrackets = {8350, 33950, 82250, 171550, 372950};
        final double[] singleRates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        final double[] marriedJointlyBrackets = {16700, 67900, 137050, 208850, 372950};
        final double[] marriedJointlyRates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        final double[] marriedSeparatelyBrackets = {8350, 33950, 68525, 104425, 186475, 372950};
        final double[] marriedSeparatelyRates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        final double[] headOfHouseholdBrackets = {11950, 45500, 117450, 190200, 372950};
        final double[] headOfHouseholdRates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        // Prompt user for filing status and income
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filing status (Single, Married Jointly, Married Separately, Head of Household): ");
        String filingStatus = scanner.nextLine();
        System.out.print("Enter taxable income: ");
        double income = scanner.nextDouble();

        // Calculate tax based on filing status and income
        double tax = 0.0;
        switch (filingStatus.toLowerCase()) {
            case "single":
                tax = calculateTax(singleBrackets, singleRates, income);
                break;
            case "married jointly":
                tax = calculateTax(marriedJointlyBrackets, marriedJointlyRates, income);
                break;
            case "married separately":
                tax = calculateTax(marriedSeparatelyBrackets, marriedSeparatelyRates, income);
                break;
            case "head of household":
                tax = calculateTax(headOfHouseholdBrackets, headOfHouseholdRates, income);
                break;
            default:
                System.out.println("Invalid filing status");
                System.exit(1); // Exit program if filing status is invalid
        }

        // Display tax amount
        System.out.println("Tax to pay: $" + tax);

        scanner.close();
    }

    // Method to calculate tax based on brackets and rates
    public static double calculateTax(double[] brackets, double[] rates, double income) {
        double tax = 0.0;
        int i = 0;
        while (i < brackets.length && income > brackets[i]) {
            if (i == 0) {
                tax += brackets[i] * rates[i];

            } else {
                tax += (brackets[i] - brackets[i - 1]) * rates[i];
            }
            i++;
        }
        if (i < brackets.length) {
            tax += (income - brackets[i - 1]) * rates[i];
        } else {
            tax += (income - brackets[i - 1]) * rates[i - 1];
        }
        return tax;
    }
}
