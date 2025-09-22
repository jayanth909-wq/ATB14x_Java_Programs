package ex_09_If_Else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab093_If_Else_P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age<65) {
            System.out.println("Can Vote");
        }else {
            System.out.println("Cant Vote");
        }
    }
}
