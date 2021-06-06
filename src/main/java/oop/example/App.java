package oop.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Micah Puccio-Ball
 */

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        int numPeople;
        int numPizza;
        int slicesPer;
        int leftOver;

        Scanner input = new Scanner(System.in);

        System.out.printf("How many people? ");
        numPeople = Integer.parseInt(input.nextLine());

        System.out.printf("How many pizzas do you have? ");
        numPizza = Integer.parseInt(input.nextLine());

        System.out.printf("How many slices per pizza? ");
        slicesPer = Integer.parseInt(input.nextLine());

        System.out.printf("%d people with %d pizzas (%d slices)\n", numPeople, numPizza, numPizza*slicesPer);
        System.out.printf("Each person gets %d slices of pizza.\n", ((numPizza*slicesPer)/numPeople));
        System.out.printf("There are %d leftover pieces.\n", ((numPizza*slicesPer) % numPeople));

    }
}
