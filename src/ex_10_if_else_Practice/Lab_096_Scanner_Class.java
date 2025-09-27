package ex_10_if_else_Practice;

import java.util.Scanner;

public class Lab_096_Scanner_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        System.out.println(height);

        // Allowed to vote or not - age
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        // How to take the user Input
        // 1. CLI Options
        //
//        int age = Integer.parseInt(args[0]);

        if (height>14) {
            System.out.println("can vote");
        }else{
            System.out.println("cant vote");
        }
    }
}
