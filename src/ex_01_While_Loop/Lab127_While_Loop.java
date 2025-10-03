package ex_01_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab127_While_Loop {
    public static void main(String[] args) {
        //Guess Number
        Random random = new Random();
        int number = random.nextInt(100)+1;
        System.out.println(number);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        int guess = scanner.nextInt();
        int attempts = 0;

        while(true){
            if(!scanner.hasNext()){
                System.out.println("not interger");
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (attempts < 0 || attempts > 100){
                System.out.println("not ok");
                continue;
            }
if (guess < number){
    System.out.println("too low");
} else if (guess > number) {
    System.out.println("too high");
}else {
    System.out.println("you are correct");
    break;
}
        }
    }
}
