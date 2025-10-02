package ex_11_For_Loop;

import java.util.Scanner;

public class Task_Factorial_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int factorial = scanner.nextInt();
        int fact =1;
        if (factorial == 0) {
            fact = 1;
        }
        for (int i = 1; i <= factorial; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
        }
    }

