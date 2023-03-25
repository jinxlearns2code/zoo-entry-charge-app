/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itc538.task2;

import java.util.Scanner;

/**
 *
 * @author kayle
 */
/* This program requests a series of inputs from a user, like number of children and adults
in a group, and then work out the total entry charge to their zoo based on different conditions.
*/

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Named constants to represent important values in the program.
        int ACCOMPANIED_CHILDREN = 2;
        int UNACCOMPANIED_CHILDREN = 5;
        int ADULTS = 10;
        int SENIORS = 8;
        
        //Declare variables and assign initial values.
        int sixToFifteen, sixteenToFiftynine, sixtyPlus;
        int totalAccompaniedChildren, totalUnaccompaniedChildren;
        int accompaniedChildrenCharge, unaccompaniedChildrenCharge, adultsCharge, seniorsCharge, initialGroupCharge;
        int totalTakings = 0;
        int keepGoing = 1;
        
        //Initialise while loop and prompt the user to input details about each family group.
        while (keepGoing != 0) {
//            System.out.print("Enter a group? (Yes=1/No=0): ");
//            keepGoing = input.nextInt();
            System.out.print("Enter the number of children (age 6–15): ");
            sixToFifteen = input.nextInt();
            System.out.print("Enter the number of adults (age 16–59): ");
            sixteenToFiftynine = input.nextInt();
            System.out.print("Enter the number of seniors (age 60+): ");
            sixtyPlus = input.nextInt();
            
        // Calculate the number of accompanied and unaccompanied children.
            totalAccompaniedChildren = Math.min(sixteenToFiftynine + sixtyPlus, sixToFifteen);
            totalUnaccompaniedChildren = sixToFifteen - totalAccompaniedChildren;
            
        //Calculate entry charges per family group.
            accompaniedChildrenCharge = totalAccompaniedChildren * ACCOMPANIED_CHILDREN;
            unaccompaniedChildrenCharge = totalUnaccompaniedChildren * UNACCOMPANIED_CHILDREN;
            adultsCharge = sixteenToFiftynine * ADULTS;
            seniorsCharge = sixtyPlus * SENIORS;
            initialGroupCharge = accompaniedChildrenCharge + unaccompaniedChildrenCharge + adultsCharge + seniorsCharge;
            
        // Display initial output - total entry charge per group.
            System.out.println("Total entry charge is $" + initialGroupCharge);
   
        // Calculate the running total for all groups.
            totalTakings = totalTakings + initialGroupCharge;
            
        // Prompt the user if they need to enter another group.
            System.out.println("");
            System.out.print("Enter a group? (Yes=1/No=0): ");
            keepGoing = input.nextInt();
        }
        
        // Display the total charge for all family groups when the program terminates.
        System.out.println("Total takings: $" + totalTakings);     
    }
}
