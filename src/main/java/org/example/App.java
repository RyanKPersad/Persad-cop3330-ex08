/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
package org.example;
import java.util.Scanner;


public class App 
{
    static Scanner myObj = new Scanner(System.in);

    public static void main( String[] args )
    {

        System.out.print("How many people? ");
        String people = myObj.nextLine();

        System.out.print("How many pizzas do you have? ");
        String pizza = myObj.nextLine();

        System.out.print("How many slices per pizza? ");
        String slices = myObj.nextLine();

        //Convert to int
        int newPpl = Integer.parseInt(people);
        int newPizza = Integer.parseInt(pizza);
        int newSlices = Integer.parseInt(slices);

        //Arithmetic
        int totalSlices = newSlices * newPizza;
        int PerPerson = totalSlices/newPpl;
        int remaining = totalSlices % newPpl;

        //Output
        String print1 = String.format("%s people with %s pizzas (%d slices)",people,pizza,totalSlices);
        String print2 = String.format("Each person gets %d pieces of pizza.\n" +
                "There are %d leftover pieces.",PerPerson,remaining);


        System.out.println(print1);
        System.out.println(print2);
    }
}
