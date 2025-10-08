package ex_16_String_Builder_Buffer;

import java.util.Scanner;

public class Lab152_SB_3 {
    public static void main(String[] args) {
        // Write a program to reverse a string without using inbuilt functions.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        String loops = scanner.next();
//        StringBuilder jinger = new StringBuilder(loops);
//        System.out.println(jinger.reverse());


        // Pramod -> user_input.length(), chatAt()
        String reversing = "";

        for (int i = loops.length()-1; i >= 0 ; i--) {
            reversing = reversing + loops.charAt(i);
            
        }
        System.out.println(reversing);

    }
}
