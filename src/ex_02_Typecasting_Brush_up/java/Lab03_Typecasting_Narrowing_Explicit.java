package ex_02_Typecasting_Brush_up.java;

public class Lab03_Typecasting_Narrowing_Explicit {

    public static void main(String[] args) {

        long phon = 986252l;

        short s = (short) phon; //narrow explicit
        System.out.println(s);
    }
}
