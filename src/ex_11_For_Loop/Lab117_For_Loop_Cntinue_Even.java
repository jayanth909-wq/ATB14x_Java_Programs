package ex_11_For_Loop;

public class Lab117_For_Loop_Cntinue_Even {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
