package ex_01_While_Loop;

import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;

public class Lab125_While_Loop_7 {
    public static void main(String[] args) {
        // Factorial Program

        // The logic building formula we are discussing.
        // Step number one, you have to figure out what is the data type for input and output.
        // Step number two, write a rough logic around this.
        // Step number three, write a proper logic around this.
        // Step number four, optimize.
        // Step number five, which is edge cases.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        if(!scanner.hasNext()){
            System.out.println("int only");
        }else{
            int ok = scanner.nextInt();
            int fact = 1;
            if (ok == 0){
                fact = 1;
                System.out.println("fact of 1");
            }
            if (ok < 0 || ok >Integer.MAX_VALUE)
            {
                System.out.println("out of bound");
            }
int i =1;
            while (i <= ok){
                fact = fact*i;
                i++;
            }
            System.out.println(fact);
            }
        }


    }

