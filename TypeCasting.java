//package com.javafundamentals;
public class TypeCasting {

    public static void main(String[] args) {

        // Implicit Casting
        int age = 30;
        double salary = age;

        System.out.println(salary);

        // Explicit Casting
        double price = 199.99;
        int amount = (int) price;

        System.out.println(amount);
    }
}