package ex_09_If_Else;

import java.util.Scanner;

public class Lab091_If_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age");
        int age = scanner.nextInt();

        if (age>18) {
            System.out.println("qaulified");

            int a = 11;
            int b = ++a;
            System.out.println(a);
            System.out.println(b);

            // Ex Res o/p
            // 10  0   0
        }
    }
}
