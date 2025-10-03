package ex_01_While_Loop;

import java.util.Scanner;

public class Lab126_While_Loop_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        if (!scanner.hasNext()) {
            System.out.println("Int only");
        }else{
            int po = scanner.nextInt();
            int fact = 1;
            if(po == 0){
                fact =1;
            }
            if (po < 0 ||po > Integer.MAX_VALUE){
                System.out.println("Out");

            }
            int i = 1;
            while (i <= po){
                fact = fact*i;
                i++;
            }
            System.out.println(fact);
        }

    }
}
