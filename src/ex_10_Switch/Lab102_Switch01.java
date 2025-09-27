package ex_10_Switch;

import java.util.Scanner;

public class Lab102_Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("ok");
                break;
            case 2:
                System.out.println("not ok");
                break;
        }
    }
}
