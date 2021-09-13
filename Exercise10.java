/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise10 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        double TAX_RATE=5.5;
        System.out.print("Enter the price of item 1: ");
        String firstItem=sc.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String quantity1=sc.nextLine();
        System.out.print("Enter the price of item 2: ");
        String secondItem=sc.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String quantity2=sc.nextLine();
        System.out.print("Enter the price of item 3: ");
        String thirdItem=sc.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String quantity3=sc.nextLine();
        double price1=Double.parseDouble(firstItem);
        int qty1=Integer.parseInt(quantity1);
        double price2=Double.parseDouble(secondItem);
        int qty2=Integer.parseInt(quantity2);
        double price3=Double.parseDouble(thirdItem);
        int qty3=Integer.parseInt(quantity3);
        double subtotal=(price1*qty1)+(price2*qty2)+(price3*qty3);
        double tax=subtotal*TAX_RATE/100;
        double total=subtotal+tax;
        System.out.println("Subtotal: $"+subtotal);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}