package ex_16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab06_Arrays_User_Input {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        int size = scanner.nextInt();

        String[] hunf = new String[5];

        for (int i = 0; i < hunf.length; i++) {
            System.out.println("tot"+i);
            hunf[i] = scanner.next();

        }
        Arrays.sort(hunf);
        System.out.println("-------");
        for (String height : hunf){

        System.out.println(height);
        }


        }
    }

