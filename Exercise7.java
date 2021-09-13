/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise7 {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        double CONVERSION=0.09290304;
        System.out.print("What is the length of the room in feet? ");
        String length=sc.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String width=sc.nextLine();
        int lengthNum=Integer.parseInt(length);
        int widthNum=Integer.parseInt(width);
       int areaFeet=lengthNum*widthNum;
       double areaMeter=areaFeet*CONVERSION;
        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");
        System.out.println("The area is");
        System.out.println(areaFeet+" square feet");
        System.out.printf("%.3f square meters",areaMeter);
    }

}