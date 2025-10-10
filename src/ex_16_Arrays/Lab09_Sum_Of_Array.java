package ex_16_Arrays;

public class Lab09_Sum_Of_Array {
    public static void main(String[] args) {
       int[] ant = {54,87,98};

       int hunt = 0;

        for (int i = 0; i < ant.length; i++) {
            hunt = hunt+ant[i];

        }
        System.out.println(hunt);
    }

}
