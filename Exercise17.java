/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise17 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        double ALCOHOL_CONTENT=.08;
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int gender=Integer.parseInt(sc.nextLine());

        System.out.print("How many ounces of alcohol did you have? ");
        String ounces=sc.nextLine();

        System.out.print("What is your weight, in pounds? ");
        String weight=sc.nextLine();
        System.out.print("How many hours has it been since your last drink? ");
        String hours=sc.nextLine();
        int ouncesAlcohol=Integer.parseInt(ounces);
        int weightNum=Integer.parseInt(weight);
        int hoursNum=Integer.parseInt(hours);
        double ratio;
        if(gender==1)
            ratio=0.73;
        else
            ratio=0.66;
        double BAC=(ouncesAlcohol*5.14/weightNum*ratio)-0.015*hoursNum;
        String output;
        if(BAC<=ALCOHOL_CONTENT)
            output="It is legal for you to drive.";
        else
            output="It is not legal for you to drive.";
        BAC=Math.round(BAC*1000000.0)/1000000.0;
        System.out.println("Your BAC is "+BAC+"\n"+output);
    }
}