/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise16 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age?  ");
        String age=sc.nextLine();
        int ageNum=Integer.parseInt(age);
        String output=(ageNum<16?"You are not old enough to legally drive.":"You are old enough to legally drive.");

        System.out.println(output);
    }
}