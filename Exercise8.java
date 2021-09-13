/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise8 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people? ");
        String numOfPeople=sc.nextLine();
        System.out.print("How many pizzas do you have? ");
        String numOfPizza=sc.nextLine();
        System.out.print("How many slices per pizza? ");
        String numOfSlices=sc.nextLine();
        int people=Integer.parseInt(numOfPeople);
        int pizzas=Integer.parseInt(numOfPizza);
        int slices=Integer.parseInt(numOfSlices);
        int totalSlices=slices*pizzas;
        System.out.println(numOfPeople+" people with "+numOfPizza+" pizzas ("+totalSlices+")");
        int eachSlice=totalSlices/people;
        int leftOver=totalSlices%people;
        System.out.println("Each person gets "+eachSlice+" pieces of pizza.");
        System.out.println("There are "+leftOver+" leftover pieces.");

    }
}