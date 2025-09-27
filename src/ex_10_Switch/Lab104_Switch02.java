package ex_10_Switch;

import java.util.Scanner;

public class Lab104_Switch02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int food = scanner.nextInt();

        switch (food){
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;

        }
    }
}
