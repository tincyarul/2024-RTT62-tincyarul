package org.example;

public class Homework_303_2_1 {

    //Write a program that declares two integer variables, assigns an integer to each, and adds them together.Assign the sum to a variable. Print out the result. in java language

    public class AddTwoNumbers {
        public static void main(String[] args) {
            // Declare two integer variables and assign values to them
            int firstNumber = 10;
            int secondNumber = 20;

            // Add the two numbers and assign the sum to a variable
            int sum = firstNumber + secondNumber;

            // Print out the result
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);

        }
    }

//Write a program that declares two double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.

    public class AddTwoDoubles {
        public static void main(String[] args) {
            // Declare two double variables and assign values to them
            double firstNumber = 3.5;
            double secondNumber = 4.7;

            // Add the two numbers and assign the sum to a variable
            double sum = firstNumber + secondNumber;

            // Print out the result
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
        }
    }

    //Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?

    public class AddIntAndDouble {
        public static void main(String[] args) {
            // Declare an integer variable and assign a value
            int intValue = 10;

            // Declare a double variable and assign a value
            double doubleValue = 4.5;

            // Add the integer and double values and assign the sum to a double variable
            double sum = intValue + doubleValue;

            // Print out the result
            System.out.println("The sum of " + intValue + " and " + doubleValue + " is: " + sum);
        }
    }

    // Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?

    // Divide the larger number by the smaller number and assign the result to a variable
    int result = num1 > num2 ? num1 / num2 : num2 / num1;

    // Print out the result
        System.out.println("The result of dividing the larger number by the smaller number is: " + result);

    // Change the larger number to a decimal
    num1 = 10;
    num2 = 5;
    double decimalNum1 = 10.0; // Change num1 to a decimal

    // Divide the larger decimal by the smaller integer and assign the result to a variable
    double resultDecimal = decimalNum1 > num2 ? decimalNum1 / num2 : num2 / decimalNum1;

    // Print out the result
        System.out.println("The result of dividing the larger decimal by the smaller number is: " + resultDecimal);
}
}

//Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.

// Corrected version
public class DivideIntegers {
    public static void main(String[] args) {
        // Declare two integer variables and assign values to them
        int num1 = 10;
        int num2 = 5;

        // Divide the larger number by the smaller number and assign the result to a variable
        int result = num1 > num2 ? num1 / num2 : num2 / num1;

        // Print out the result
        System.out.println("The result of dividing the larger number by the smaller number is: " + result);

        // Change the larger number to a decimal
        num1 = 10;
        num2 = 5;
        double decimalNum1 = 10.0; // Change num1 to a decimal

        // Divide the larger decimal by the smaller number and assign the result to a variable
        double resultDecimal = decimalNum1 > num2 ? decimalNum1 / num2 : num2 / decimalNum1;

        // Print out the result
        System.out.println("The result of dividing the larger decimal by the smaller number is: " + resultDecimal);

        //Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again

        public class DivisionAndCasting {
            public static void main(String[] args) {
                // Declare two integer variables x and y
                int x = 5;
                int y = 6;

                // Declare a variable q and assign y/x to it
                int q = y / x;

                // Print q
                System.out.println("Value of q (integer division): " + q);

                // Cast y to a double and assign it to q
                q = (double) y;

                // Print q again
                System.out.println("Value of q (after casting y to double): " + q);
            }
        }

        //Write a program that declares a named constant and uses it in a calculation. Print the result.

        public class CircleArea {
            public static void main(String[] args) {
                // Declare a named constant PI
                final double PI = 3.14159;

                // Declare a variable for the radius of the circle
                double radius = 5.0;

                // Calculate the area of the circle using the formula: area = π * radius^2
                double area = PI * radius * radius;

                // Print out the result
                System.out.println("The area of the circle with radius " + radius + " is: " + area);
            }
        }

        //●	Write a program where you create three variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product, four items of the second product, and two items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.

        import java.text.DecimalFormat;

        public class CafeOrder {
            public static void main(String[] args) {
                // Declare variables for product names and prices
                String product1 = "Coffee";
                double price1 = 2.50;

                String product2 = "Cappuccino";
                double price2 = 3.00;

                String product3 = "Espresso";
                double price3 = 2.00;

                // Declare variables for order quantities
                int quantity1 = 3;
                int quantity2 = 4;
                int quantity3 = 2;

                // Calculate subtotal
                double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);

                // Define constant for sales tax
                final double SALES_TAX = 0.08;

                // Calculate total sale including sales tax
                double totalSale = subtotal * (1 + SALES_TAX);

                // Format results to two decimal places
                DecimalFormat df = new DecimalFormat("#.00");

                // Print out the order details
                System.out.println("Product\t\tPrice\t\tQuantity\tTotal");
                System.out.println("----------------------------------------------");
                System.out.println(product1 + "\t\t$" + price1 + "\t\t" + quantity1 + "\t\t$" + df.format(price1 * quantity1));
                System.out.println(product2 + "\t$" + price2 + "\t\t" + quantity2 + "\t\t$" + df.format(price2 * quantity2));
                System.out.println(product3 + "\t\t$" + price3 + "\t\t" + quantity3 + "\t\t$" + df.format(price3 * quantity3));
                System.out.println("----------------------------------------------");
                System.out.println("Subtotal:\t\t\t\t\t$" + df.format(subtotal));
                System.out.println("Sales Tax:\t\t\t\t\t$" + df.format(subtotal * SALES_TAX));
                System.out.println("Total Sale:\t\t\t\t\t$" + df.format(totalSale));
            }
        }

}
