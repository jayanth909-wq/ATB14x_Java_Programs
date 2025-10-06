package ex_15_Strings;

import java.sql.SQLOutput;
import java.util.Locale;

public class Lab137_String_Functions {
    public static void main(String[] args) {
        char k = 'A';
        System.out.println(k);

        String g7 = "hijk";
        System.out.println(g7);
        System.out.println(g7.length());
        System.out.println(g7.toUpperCase(Locale.ROOT));
        System.out.println(g7.toLowerCase());
        System.out.println(g7.concat("er"));


    }
}
