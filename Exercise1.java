/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;
public class Exercise1 {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("What is your name? ");
        String name=sc.nextLine();
        String output="Hello, "+name+", nice to meet you!";
        System.out.println(output);
    }
}
