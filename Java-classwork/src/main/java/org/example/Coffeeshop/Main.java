package org.example.Coffeeshop;

public class Main {

    private org.example.coffeeshop.CoffeeShop;

    public void printMenu() {
        System.out.println("0) Exit");
        System.out.println("1) Print the list of products");
        System.out.println("2) Order a product");

    }

    public void runCoffeeShop() {
        org.example.coffeeshop.CoffeeShop CoffeeShop = new org.example.coffeeshop.CoffeeShop();
        CoffeeShop.initProducts();
        CoffeeShop.printProducts();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.runCoffeeShop();
    }

}

