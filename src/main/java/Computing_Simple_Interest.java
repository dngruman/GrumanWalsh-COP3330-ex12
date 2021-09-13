/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */
import java.util.Scanner;
public class Computing_Simple_Interest {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double p, r, t, A;

        //User enter Inputs
        System.out.print("Enter the principal: ");
        p = user_input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        r = user_input.nextDouble();
        System.out.print("Enter the number of years: ");
        t = user_input.nextDouble();

        //Calculating Interest while converting input interest to percentage
        A = p*(1 +(r*t)/100);

        //Output of calculation Displayed
        System.out.println("After " +String.format("%.0f", t)+ " years at " +String.format("%.1f", r)+ "%, the investment will be worth $" +String.format("%.2f", A)+ ".");
    }
}
