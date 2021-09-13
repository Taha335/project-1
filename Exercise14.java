/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise14 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        double TAX_RATE=5.5;
        System.out.print("What is the order amount?  ");
        String order=sc.nextLine();
        System.out.print("What is the state? ");
        String state=sc.nextLine();
        double orderAmount=Double.parseDouble(order);
        double tax=orderAmount*TAX_RATE/100;
        double total=orderAmount+tax;
        String output="The subtotal is $"+orderAmount+".\nThe tax is $"+tax+".\nThe total is $"+total+".";
        if(state.compareTo("WI")!=0) {
            total=orderAmount;
            output ="The total is $"+total+".";
        }System.out.println(output);
    }
}