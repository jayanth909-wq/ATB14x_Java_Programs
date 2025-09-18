package ex_Java_Practice_Ternary.java;

public class Lab069_TO7 {
    // Find the maximum between the three numbers.
    // Now we will be using the logic building formula.
    public static void main(String[] args) {
        // Step 1 : Find inputs /outputs
        // I/O -> n1,n2,n3 - int
        // O/P -> String ->  max number

        // Step 2 - Rough Logic, Think about it.
        // n1 > n2 and n1  > n3 -> n1
        // n2 > n3 and n2>  n1 ->  n2
        // n3

        // Step 3
//        int max = (n1> n2) ? A : B;
        int g1 = -876;
        int h2 = -432;
        int i3 = -21;
        int result = (g1 > h2) ? (h2 > i3) ? g1 : i3 : (h2 > i3) ? h2 : i3;
        System.out.println(result);
    }
}
