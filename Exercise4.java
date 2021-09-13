/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise4 {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a noun: ");
        String noun=sc.nextLine();
        System.out.print("Enter a verb: ");
        String verb=sc.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective=sc.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb=sc.nextLine();
        System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+" ? That's hilarious!");

    }

}