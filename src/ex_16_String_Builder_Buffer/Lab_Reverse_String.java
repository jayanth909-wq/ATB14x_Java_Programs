package ex_16_String_Builder_Buffer;

import java.util.Scanner;

public class Lab_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        String kuh = scanner.next();

        String jun = "";

        for (int i = kuh.length()-1; i >=0 ; i--) {
            jun = jun + kuh.charAt(i);

        }
        System.out.println(jun);
    }
}
