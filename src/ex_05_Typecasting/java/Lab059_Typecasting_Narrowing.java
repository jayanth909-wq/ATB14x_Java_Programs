package ex_05_Typecasting.java;

public class Lab059_Typecasting_Narrowing {
    public static void main(String[] args) {
        int the = 300; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        byte pol = (byte)the; // Narrowing (int -> byte) - Explicit Casting is not allowed.
        //Data Loss
        System.out.println(pol);
    }
}
