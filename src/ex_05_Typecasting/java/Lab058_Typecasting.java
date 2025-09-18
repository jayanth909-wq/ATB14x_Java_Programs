package ex_05_Typecasting.java;

public class Lab058_Typecasting {
    public static void main(String[] args) {
        byte ut = 54;
        int nh = (byte)ut; //  Widening -> Implicit Casting
        System.out.println(nh); // Widening -> Explicit Casting
    }
}
