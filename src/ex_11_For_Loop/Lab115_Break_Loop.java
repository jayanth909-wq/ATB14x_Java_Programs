package ex_11_For_Loop;

public class Lab115_Break_Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49 50 times
            System.out.println(i);
            if (i == 17){
                break;
            }

        }
    }
}
