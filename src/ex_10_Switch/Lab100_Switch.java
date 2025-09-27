package ex_10_Switch;

import java.util.Scanner;

public class Lab100_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        switch(age){
        case 1:
            System.out.println("food");
            case 2:
                System.out.println("mon");
            case 3:
                System.out.println("tue");
            case 4:
                System.out.println("wed");
            case 5:
                System.out.println("thru");
            case 6:
                System.out.println("fri");
            case 7:
                System.out.println("sat");
            case 8:
                System.out.println("sunday");
        }
    }
}
