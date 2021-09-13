/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise19 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        double BMI_LOW=18.5;
        double BMI_HIGH=25;
        System.out.print("Enter the height in inches: ");
        double height=sc.nextDouble();
        System.out.print("Enter the weight in pounds: ");
        double weight=sc.nextDouble();
        double BMI=(weight/(height*height))*703;
        String output;
        if(BMI<BMI_LOW)
            output="You are underweight. You should see your doctor.";
        else if(BMI>BMI_HIGH)
            output="You are overweight. You should see your doctor.";
        else
            output="You are within the ideal weight range.";
        System.out.printf("Your BMI is %.1f\n",BMI);
        System.out.println(output);
    }
}