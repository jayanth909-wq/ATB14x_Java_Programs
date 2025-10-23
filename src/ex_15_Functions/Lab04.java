package ex_15_Functions;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        int food = name(a,b);
        int due = name(a,b);
        int hig = name(a,b);
        System.out.println(food);
        System.out.println(due);
        System.out.println(hig);
    }
    static int name  (int a, int b) {

        return a+b;
    }

    static void name(){
        System.out.println("name");
    }
}
