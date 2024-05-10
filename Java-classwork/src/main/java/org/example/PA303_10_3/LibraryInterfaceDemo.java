package org.example.PA303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Test case #1: KidUser
        KidUser kid = new KidUser(10, "Kids");
        kid.registerAccount();
        kid.requestBook();

        kid = new KidUser(18, "Kids");
        kid.registerAccount();
        kid.requestBook();

        kid = new KidUser(10, "Fiction");
        kid.registerAccount();
        kid.requestBook();

        // Test case #2: AdultUser
        AdultUser adult = new AdultUser(5, "Fiction");
        adult.registerAccount();
        adult.requestBook();

        adult = new AdultUser(23, "Kids");
        adult.registerAccount();
        adult.requestBook();

        adult = new AdultUser(23, "Fiction");
        adult.registerAccount();
        adult.requestBook();
    }
}
