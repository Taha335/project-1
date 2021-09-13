/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise11 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        double TAX_RATE=5.5;
        System.out.print("How many euros are you exchanging?  ");
        String euros=sc.nextLine();
        System.out.print("What is the exchange rate?  ");
        String exchange=sc.nextLine();
        double euro=Double.parseDouble(euros);
        double exchangeRate=Double.parseDouble(exchange);
        double dollars=euro*exchangeRate;

        System.out.printf("%.0f euros at an exchange rate of %.4f is\n%.2f U.S. dollars.\n",euro,exchangeRate,dollars);
    }
}