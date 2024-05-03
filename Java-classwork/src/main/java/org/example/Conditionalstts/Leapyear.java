package org.example.Conditionalstts;

public class Leapyear {
    public static void main(String[] args) {
        int year;
        year =2004;
        if(year % 4 == 0 && year % 4 > 0) {
            System.out.println(" It is a leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }
    }
}
