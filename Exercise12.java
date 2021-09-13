/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise12 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String principal=sc.nextLine();
        System.out.print("Enter the rate of interest: ");
        String rate=sc.nextLine();
        System.out.print("Enter the number of years: ");
        String year=sc.nextLine();
        double principalAmt=Double.parseDouble(principal);
        double rateOfInterest=Double.parseDouble(rate);
        int yearOfInterest=Integer.parseInt(year);
        double interest=Math.ceil(principalAmt*(1+(rateOfInterest*yearOfInterest/100)));

        System.out.println("After "+yearOfInterest+" years at "+rateOfInterest+"%, the investment will be worth $"+interest);
    }
}