package ex_10_Switch;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Lab099__Switch {
    public static void main(String[] args) {
        // You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.

        // Logic Building Formula

        // Step 1 - Number one is using the Scanner class.
        // Step 2 number two will be basically figuring out the expression and the day.
        // Step 3- We will basically add step 3 as a rough logic.
        // Step 4 - 4 is you will write the fix the logic and optimize.
        // Step 5 - figure out the edge cases.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the routine");

        // Switch

        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error
        if (scanner.hasNextInt());
        int day = scanner.nextInt();
        switch(day){
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thrusday");
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
        }

    }
}
