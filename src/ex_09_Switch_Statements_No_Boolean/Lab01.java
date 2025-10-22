package ex_09_Switch_Statements_No_Boolean;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age 1 to 7");


        if (scanner.hasNextInt()){
            int day = scanner.nextInt();

            switch (day){
                case 1:
                    System.out.println("mon");
                    break;
                case 2:
                    System.out.println("tue");
                    break;

                case 3:
                    System.out.println("wed");
                    break;
                case 4:
                    System.out.println("thru");
                    break;

                case 5:
                    System.out.println("fri");
                    break;

                case 6:
                    System.out.println("sat");
                    break;

                case 7:
                    System.out.println("sund");
                    break;
                default:
                    System.out.println("enter 1 to 7 onlt");

            }






        }
        else{
            System.out.println("exit loop");
        }


    }
}
