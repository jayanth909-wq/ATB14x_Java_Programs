package ex_10_Loops;

import java.util.Scanner;

public class Lab14      {
    public static void main(String[] args) {

        Scanner sacnner = new Scanner(System.in);
        System.out.println("Enter fact");
        int d = sacnner.nextInt();

        int fact =1;
        if (d==0){
            fact = 1;
        }
        for (int i = 1; i <= d ; i++) {
            fact = fact*i;


        }
        System.out.println(fact);
    }
}
