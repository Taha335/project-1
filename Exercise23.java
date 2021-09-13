/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Taha Al Balushi
 */
import javax.swing.text.html.StyleSheet;
import java.util.*;

public class Exercise23 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String choice=sc.nextLine();
        String output;
        choice.toLowerCase();
        if(choice.compareTo("yes")==0 || choice.compareTo("y")==0)
        {
            System.out.print("Are the battery terminals corroded? ");
            String bat=sc.nextLine();
            bat.toLowerCase();
            if(bat.compareTo("yes")==0 || bat.compareTo("y")==0)
                output="Clean terminals and try starting again.";
            else
                output="Replace cables and try again.";
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            String noise=sc.nextLine();
            noise.toLowerCase();
            if(noise.compareTo("yes")==0 || noise.compareTo("y")==0)
                output="Replace the battery.";
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                String crank=sc.nextLine();
                crank.toLowerCase();
                if(crank.compareTo("yes")==0 || crank.compareTo("y")==0)
                    output="Check spark plug connections.";
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    String engine=sc.nextLine();
                    engine.toLowerCase();
                    if(engine.compareTo("yes")==0 || engine.compareTo("y")==0)
                    {
                        System.out.print("Does you car have fuel injection? ");
                        String fuel=sc.nextLine();
                        fuel.toLowerCase();
                        if(fuel.compareTo("yes")==0 || fuel.compareTo("y")==0)
                            output="Get it in for service.";
                        else
                            output="Check to ensure the choke is opening and closing.";
                    }
                    else
                        output="This should not be possible.";
                }
            }
        }
        System.out.println(output);
    }
}