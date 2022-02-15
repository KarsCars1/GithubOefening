package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 50.0;
        double b = 2.1;
        System.out.println(a + " + " + b + ": " + (a + b));
        System.out.println(substract(a, b));
    }

    public static double substract(double a, double b){
        return a - b;
    }

    public static void printHelloWorld(){
        System.out.println("Hello World!");
    }
}
