package com.softserveinc;

/*
    Task: Write the program that prints all lines as in the example below:

    Starting to make a coffee
    Grinding coffee beans
    Boiling water
    Mixing boiled water with crushed coffee beans
    Pouring coffee into the cup
    Pouring some milk into the cup
    Coffee is ready!
 */
public class Task01 {
    public static void main(String[] args) {
        // TODO: Write your code here

        String coffee = "Pouring coffee into the cup";
        String milk = "Pouring some milk into the cup";
        String ready = "Coffee is ready!";
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water\n" +
                "Mixing boiled water with crushed coffee beans");
        System.out.println(coffee);
        System.out.println(milk);
        System.out.println(ready);

    }
}