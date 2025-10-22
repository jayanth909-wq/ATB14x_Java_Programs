package ex_10_Loops;

public class Lab13 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i%2 !=0){
                continue;

            }
            System.out.println("odd->"  +i);
        }
    }
}
