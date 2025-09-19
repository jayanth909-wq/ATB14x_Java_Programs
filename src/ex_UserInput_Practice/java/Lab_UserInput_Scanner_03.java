package ex_UserInput_Practice.java;

import java.util.Scanner;

public class Lab_UserInput_Scanner_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("this is \n age");
        System.out.println(scanner.next());

        System.out.println("this is integer");
        int age_good = scanner.nextInt();
        System.out.println(age_good);

        System.out.println("this is double");
        double twoo = scanner.nextDouble();
        System.out.println(twoo);

        System.out.println("floating");
        float red = scanner.nextFloat();
        System.out.println(red);

        System.out.println("bytg");
        int king = scanner.nextByte();
        System.out.println(king);
    }
}
