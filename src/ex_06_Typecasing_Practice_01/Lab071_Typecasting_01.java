package ex_06_Typecasing_Practice_01;

public class Lab071_Typecasting_01 {
    public static void main(String[] args) {
        byte b =65;
     //   int a = b; // // // Valid syntax - Implicit - Casting -> Widening ->
        int hb = (byte)b; // explicit widening
        System.out.println(hb);
    }
}
