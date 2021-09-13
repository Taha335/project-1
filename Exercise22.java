/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise22 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=Integer.parseInt(sc.nextLine());
        System.out.print("Enter the second number: ");
        int b=Integer.parseInt(sc.nextLine());
        System.out.print("Enter the third number: ");
        int c=Integer.parseInt(sc.nextLine());
        int largest= a > b ? ( a > c ? a : c) : (b > c ? b : c);
        String output="The largest number is "+largest+".";

        System.out.println(output);
    }
}