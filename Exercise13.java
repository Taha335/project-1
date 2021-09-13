/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise13 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the principal amount?  ");
        String principal=sc.nextLine();
        System.out.print("What is the rate? ");
        String rate=sc.nextLine();
        System.out.print("What is the number of years? ");
        String year=sc.nextLine();
        System.out.print("What is the number of times the interest is compounded per year? ");
        String times=sc.nextLine();
        double principalAmt=Double.parseDouble(principal);
        double rateOfInterest=Double.parseDouble(rate);
        int yearOfInterest=Integer.parseInt(year);
        int time=Integer.parseInt(times);
        double power=time*yearOfInterest;
        double amount=principalAmt*Math.pow((1+(rateOfInterest/100/time)),power);
        amount=Math.round(amount*100.0)/100.0;
        System.out.println("$"+principalAmt+" invested at "+rateOfInterest+"% for "+yearOfInterest+" years compounded "+time+" times per year is $"+amount);
    }
}