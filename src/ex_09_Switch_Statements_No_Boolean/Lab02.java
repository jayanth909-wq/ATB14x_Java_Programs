package ex_09_Switch_Statements_No_Boolean;

import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("age");
        int age = scanner.nextInt();


        if (scanner.hasNext()){
            int day = scanner.nextInt();


            switch (day){
                case 1:
                    System.out.println("mon");
break;
                case 2:
                    System.out.println("tue");
                    break;
                default:
                    System.out.println("Enter integer");

            }
            {



            }

        }

    }
}
