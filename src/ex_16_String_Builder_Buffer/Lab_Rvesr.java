package ex_16_String_Builder_Buffer;

import java.util.Scanner;

public class Lab_Rvesr {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        String jink = scanner.next();

        String okok = "";

        char[] arr = jink.toCharArray();

        for (int i = arr.length - 1; i >=0 ; i--) {
            okok = okok + arr[i];



        }
        System.out.println(okok);
    }
}
