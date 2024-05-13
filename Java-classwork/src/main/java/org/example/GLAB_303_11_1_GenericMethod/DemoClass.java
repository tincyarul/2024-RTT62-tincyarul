package org.example.GLAB_303_11_1_GenericMethod;

public class DemoClass {
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}
