package ex_16_Strings;


import java.util.Locale;

public class Lab04 {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        String s1 = "ABCV";
        System.out.println(s1);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s1.concat("ed"));

        s1= s1.toUpperCase();
        System.out.println(s1);
    }


}
