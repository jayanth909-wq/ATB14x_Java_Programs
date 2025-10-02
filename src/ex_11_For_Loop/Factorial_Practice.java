package ex_11_For_Loop;

import java.util.Scanner;

public class Factorial_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int fact = scanner.nextInt();
        int king = 1;
        if (fact ==0) {
            king = 1;
        }
        for (int i = 1; i <= fact ; i++) {
            king = king*i;


        }
        System.out.println(king);
        }
    }

