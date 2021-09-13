/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise18 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius. ");
        System.out.println("Press F to convert from Celsius to Fahrenheit. ");
        System.out.print("Your choice: ");
        String choice=sc.nextLine();
        String input,output;
        double convert;
        if(choice.toUpperCase().compareTo("C")==0)
        {
            input="Fahrenheit";
        }
        else
        {
            input="Celsius";

        }
        System.out.print("Please enter the temperature in "+input+" : ");
        double temp=Double.parseDouble(sc.nextLine());
        if(input.compareTo("Celsius")==0) {
            convert = (temp * 9 / 5) + 32;
            output="The temperature in Fahrenheit is ";
        }
        else {
            convert = (temp - 32) * 5 / 9;
            output="The temperature in Celsius is ";
        }
        System.out.println(output+convert+".");
    }
}