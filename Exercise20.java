/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise20 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        double Wisconsin_tax=5;
        double Illinois_tax=8;
        System.out.print("What is the order amount? ");
        double amount=Double.parseDouble(sc.nextLine());
        System.out.print("What state do you live in? ");
        String state=sc.nextLine();
        double tax;
        String output;
        if(state.compareTo("Wisconsin")==0) {
            System.out.print("What county do you live in? ");
            String county = sc.nextLine();
            if(county.compareTo("Eau Claire")==0)
                tax=Wisconsin_tax/100*amount+0.005;
            else if(county.compareTo("Dunn")==0)
                tax=Wisconsin_tax/100*amount+0.004;
            else
                tax=Wisconsin_tax/100*amount;
            tax=Math.round(tax*100.0)/100.0;
            output="The tax is $"+tax+".\nThe total is $"+(amount+tax)+".";
        }
        else if(state.compareTo("Illinois")==0)
        {
            tax=Illinois_tax/100*amount;
            tax=Math.round(tax*100.0)/100.0;
            output="The tax is $"+tax+".\nThe total is $"+(amount+tax)+".";
        }
        else
            output="The total is $"+amount+".";
        System.out.println(output);
    }
}