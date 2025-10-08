package ex_16_String_Builder_Buffer;

import java.util.Scanner;

public class Lab153_SB_Reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        String king = scanner.next();

        String input = "";

        for (int i = king.length() -1; i >=0 ; i--) {
            input = input + king.charAt(i);

        }
        System.out.println(input);
    }
}
