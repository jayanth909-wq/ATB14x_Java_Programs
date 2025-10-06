package ex_013_Functions;

import java.util.Scanner;

public class Lab130_Function_Arth {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int o = hub(scanner, "value of one");
        int p = hub(scanner, "value of 2");

        int king = sum(o , p);
        int fun = dum(o, p);
        int sup = mul(o,p);
        int zun = mod(o,p);
        int min = div(o,p);

        System.out.println(king);
        System.out.println(fun);
        System.out.println(sup);
        System.out.println(zun);
        System.out.println(min);

    }

    static int hub(Scanner scanner, String prompt) {
        if (scanner.hasNextInt()) {
            System.out.println("Enter value");
            return scanner.nextInt();

        } else {
            System.out.println("out");
            System.exit(0);
            return 0;
        }


    }

    static int dum(int o, int p) {
        return o - p;
    }

    static int sum(int o, int p) {
        return o + p;
    }

    static int mul(int o, int p) {
        return o * p;
    }

    static int mod(int o, int p) {
        return o % p;
    }

    static int div(int o, int p) throws ArithmeticException{
        if (p == 0) {
            throw new ArithmeticException("not dividable by 0");
        }
return o / p;
        }

}