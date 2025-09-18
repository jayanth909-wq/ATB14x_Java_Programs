package ex_05_Typecasting.java;

public class Lab063_Typecasting_Practice {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        // int total = course+GST; Implicit Narrowing
        int result = course+(int)GST; //Explicit narrowing
        System.out.println(result);

        float result2 = course+GST; // Widening auto Implicit
        float result3  = course+(float)GST; // widening explicit
        System.out.println(result2);
        System.out.println(result3);




    }
}
