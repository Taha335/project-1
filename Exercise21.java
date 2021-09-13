/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import java.util.*;

public class Exercise21 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int month=Integer.parseInt(sc.nextLine());
        String output="The name of the month is ";
        switch (month)
        {
            case 1:
                output=output+"January.";
                break;
            case 2:
                output=output+"February.";
                break;
            case 3:
                output=output+"March.";
                break;
            case 4:
                output=output+"April.";
                break;
            case 5:
                output=output+"May.";
                break;
            case 6:
                output=output+"June.";
                break;
            case 7:
                output=output+"July.";
                break;
            case 8:
                output=output+"August.";
                break;
            case 9:
                output=output+"September.";
                break;
            case 10:
                output=output+"October.";
                break;
            case 11:
                output=output+"November.";
                break;
            case 12:
                output=output+"December.";
                break;
        }
        System.out.println(output);
    }
}