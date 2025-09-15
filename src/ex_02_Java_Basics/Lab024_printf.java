package ex_02_Java_Basics;

import java.sql.SQLOutput;

public class Lab024_printf
{
    public static void main(String[] args) {
        int a = 654;
        int b = 764;
//        System.out.println(a);
//        System.out.println(b);
        System.out.printf("Value of a=%d" ,a);
        System.out.printf("Value of b=%d" ,b);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        int table = 9;
        System.out.printf("Value of table*1=%d", table*1 , table);
    }
}
