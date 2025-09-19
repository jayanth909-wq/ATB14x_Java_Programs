package ex_UserInput_Practice.java;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("my name");
        System.out.println(scanner.next());

        System.out.println("this is an integer");
        int number = scanner.nextInt();
        System.out.println(number);

        System.out.println("this is byte");
        int bits = scanner.nextByte();

        System.out.println("Double");
        double nits = scanner.nextDouble();

    }
}
