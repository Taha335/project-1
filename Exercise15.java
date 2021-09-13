/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise15 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        String KNOWN_PASSWORD="abc$123";
        System.out.print("What is the password?  ");
        String password=sc.nextLine();
        String output;
        if(password.compareTo(KNOWN_PASSWORD)==0)
            output="Welcome!";
        else
            output="I don't know you.";
        System.out.println(output);
    }
}