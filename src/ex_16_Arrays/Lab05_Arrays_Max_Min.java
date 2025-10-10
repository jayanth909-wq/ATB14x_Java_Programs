package ex_16_Arrays;

import java.util.Arrays;

public class Lab05_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] maxwell = {23, 45, 67, 89, 85, 3, 2, 35, 44};

//      Arrays.sort(maxwell);
//        System.out.println(maxwell[maxwell.length-1]);


       int yup = maxwell[0];
        for (int i = 2; i < maxwell.length; i++) {
            if (maxwell[i] < yup){
                yup = maxwell[i];

        }
            }
        System.out.println(yup);
        }

        }






