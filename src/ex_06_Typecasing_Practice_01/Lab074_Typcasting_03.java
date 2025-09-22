package ex_06_Typecasing_Practice_01;

public class Lab074_Typcasting_03 {
    public static void main(String[] args) {
        float ok = 86328765209f;
        short logic = (short)ok; // Narrowing - Explicit
        //        short s = phone_no; // Narrowing - implicit
        System.out.println(logic);
    }
}
