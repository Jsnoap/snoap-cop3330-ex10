/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Function is designed to prompt user to input 3 items and associated prices and then print Subtotal, Tax, and Total.
    public static void main( String[] args )
    {
        int onePrice, twoPrice, threePrice, oneQuan, twoQuan, threeQuan;
        double subtotal, tax, total;

        System.out.println("Enter the price of item 1: ");
        Scanner inputOnePrice = new Scanner(System.in);
        onePrice = inputOnePrice.nextInt();

        System.out.println("Enter the quantity of item 1: ");
        Scanner inputOneQuan = new Scanner(System.in);
        oneQuan = inputOneQuan.nextInt();

        System.out.println("Enter the price of item 2: ");
        Scanner inputTwoPrice = new Scanner(System.in);
        twoPrice = inputTwoPrice.nextInt();

        System.out.println("Enter the quantity of item 2: ");
        Scanner inputTwoQuan = new Scanner(System.in);
        twoQuan = inputTwoQuan.nextInt();

        System.out.println("Enter the price of item 3: ");
        Scanner inputThreePrice = new Scanner(System.in);
        threePrice = inputThreePrice.nextInt();

        System.out.println("Enter the quantity of item 3: ");
        Scanner inputThreeQuan = new Scanner(System.in);
        threeQuan = inputThreeQuan.nextInt();

        subtotal = (onePrice * oneQuan) + (twoPrice * twoQuan) + (threePrice * threeQuan);
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));

        tax = subtotal * .055;
        System.out.println("Tax: $" + String.format("%.2f", tax));

        total = subtotal + tax;
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
