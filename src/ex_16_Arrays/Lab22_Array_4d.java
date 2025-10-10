package ex_16_Arrays;

public class Lab22_Array_4d {
    public static void main(String[] args) {
        int [][] sum = {{1,3,4}, {5,6,7}, {4,4,5}};

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length ; j++) {
               // System.out.print(sum[i][j]);//
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
