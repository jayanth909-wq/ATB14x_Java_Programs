package ex_10_Switch;

import java.util.Scanner;

public class Lab105_Switch03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the routine");
        if (scanner.hasNextInt()){
            int age = scanner.nextInt();
            switch (age){
                case 1:
                    System.out.println("minor");
                    break;
                case 2:
                    System.out.println("major");
                    break;
            }
        }
    }
}
