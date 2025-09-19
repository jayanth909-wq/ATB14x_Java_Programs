package ex_UserInput_Practice.java;

import java.util.Scanner;

public class Lab_UserInput_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();


        String canivote = age >= 18 ? "yes" : "no";
        System.out.println(canivote);
    }
}
