package ex_16_Arrays;

import java.util.Arrays;

public class Lab10_Array_Interview {
    public static void main(String[] args) {
        int [] numbers = {11,23,56,6,721,12};

//        Arrays.sort(numbers);
//        System.out.println(numbers[numbers.length-2]);

        int good = numbers[0];

        for (int i = 2; i < numbers.length-2; i++) {
            if(numbers[i] < good){
                System.out.println();
                good = numbers[i];
            }

            System.out.println(good);
        }




    }
}
