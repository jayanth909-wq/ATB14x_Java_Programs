package ex_15_Functions;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = read(scanner, "enter num");
        int b = read(scanner, "enter num2");
        int result = sum(a,b);
        int result2 = min(a,b);
        int result3 = mul(a,b);
        int result4 = div(a,b);
        int result5 = mod(a,b);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


    }

    static int read(Scanner scanner, String Prompt){
        if (scanner.hasNext()){
            return scanner.nextInt();
        }
        else {
            System.out.println("enter inter only");
            System.exit(0);
            return-1;
        }
    }
    static int sum (int a , int b){
        return a+b;
    }
    static int min (int a , int b){
        return a-b;
    }
    static  int mul (int a , int b){
        return a*b;
    }

    static  int mod (int a , int b){
        return a%b;


    }

    static int div (int a , int b){
        if (b==0){
            throw new ArithmeticException("div by 0 not posible");
        }
        return a/b;
    }
}
