/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise5 {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("What is the first number? ");
        String number1=sc.nextLine();
        System.out.print("What is the second number? ");
        String number2=sc.nextLine();
        int num1=Integer.parseInt(number1);
        int num2=Integer.parseInt(number2);
        int sum=num1+num2;
        int difference=num1-num2;
        int product=num1*num2;
        int quotient=num1/num2;
        System.out.println(number1+" + "+number2+" = "+sum);
        System.out.println(number1+" - "+number2+" = "+difference);
        System.out.println(number1+" * "+number2+" = "+product);
        System.out.println(number1+" / "+number2+" = "+quotient);

    }

}