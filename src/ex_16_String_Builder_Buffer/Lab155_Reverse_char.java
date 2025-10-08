package ex_16_String_Builder_Buffer;

import java.util.Scanner;

public class Lab155_Reverse_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        String user = scanner.next();


        String sweet = "";
        char[] arr = user.toCharArray();

        for (int i = arr.length -1; i >= 0 ; i--) { //index starts from 0 so -1
            sweet = sweet + arr[i];


        }
        System.out.println(sweet);
    }
}
