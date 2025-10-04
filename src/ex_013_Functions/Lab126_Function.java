package ex_013_Functions;


import java.util.Scanner;

public class Lab126_Function {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("val a");
        int a = scanner.nextInt();
        System.out.println("val b");
        int b = scanner.nextInt();

        int pass = Hi_dude(a,b);
        System.out.println(pass);




    }

    static int Hi_dude(int a, int b) {
        return a+b;
    }
}