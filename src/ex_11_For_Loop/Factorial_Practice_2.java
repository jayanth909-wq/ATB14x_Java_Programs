package ex_11_For_Loop;

import java.util.Scanner;

public class Factorial_Practice_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        int uh = scanner.nextInt();
        int ki = 1;
        if (uh == 0){
            ki = 1;
        }
        for (int i = 1; i <= uh ; i++) {
         ki = ki*i;
        }
        System.out.println(ki);
    }
}
