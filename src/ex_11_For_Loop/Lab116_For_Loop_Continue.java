package ex_11_For_Loop;

public class Lab116_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 65; i++) {
            if (i == 21){
                continue;
        }
            System.out.println(i);
        }
    }
}
