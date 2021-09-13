/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise6 {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("What is your current age? ");
        String age=sc.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retire=sc.nextLine();
        int ageNum=Integer.parseInt(age);
        int retireNum=Integer.parseInt(retire);
        int leftYears=retireNum-ageNum;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retirmentYear=year+leftYears;
        System.out.println("You have "+leftYears+" years left until you can retire.");
        System.out.println("It's "+year+", so you can retire in "+retirmentYear+".");
    }

}