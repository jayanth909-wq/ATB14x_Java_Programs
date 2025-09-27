package ex_10_if_else_Practice;

import java.sql.SQLOutput;

public class Lab096_If_Condition_02 {
    public static void main(String[] args) {
        String food = args[0];
        int age = Integer.parseInt(food);
        if (age > 25) {
            System.out.println("can i goa");
        }
    else {
            System.out.println("cant go goa");
        }


    }
}
