package ex_Java_Practice_Ternary.java;

public class Lab070_TO8 {
    public static void main(String[] args) {
        int ab = -21;
        int kj = -76;
        int ht = -86;
        int vc = 9;
        int result = (ab > kj) ? (ab > ht) ? ab : ht : (kj > ht) ? (kj > vc) ? kj : vc : ht;
        System.out.println(result);

    }
}
