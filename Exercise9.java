/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise9 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        double CONERVSION=350;
        System.out.print("Enter the length of room: ");
        String length=sc.nextLine();
        System.out.print("Enter the width of the room: ");
        String width=sc.nextLine();
        int len=Integer.parseInt(length);
        int wid=Integer.parseInt(width);
        double area=len*wid;
        int numOfGallons=(int)Math.ceil(area/CONERVSION);
        System.out.println("You will need to purchase "+numOfGallons+" gallons of paint to cover "+(int)area+" square feet.");

    }
}