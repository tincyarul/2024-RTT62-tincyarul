package org.example.PA_303_5_1;

public class Multiplicationtable {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        System.out.println("Multiplication Table 12x12");
        System.out.println("-".repeat(45));
        System.out.print("    ");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n" + "-".repeat(45));

        for (int i = 1; i <= 12; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

}
