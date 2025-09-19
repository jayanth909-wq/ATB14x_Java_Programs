package ex_06_Increment_Decrement.java;

public class Lab01_In_De_01 {
    public static void main(String[] args) {

        int a = 77;
        System.out.println(a++ + a++);
        System.out.println(a);

        // a++ -> A -> ExpA -> 77 , a ->  78
        // a++ -> A -> ExpA -> 78 , a ->  79

        // ++a -> A -> ExpA -> 11 , a -> 11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12

        // a++ -> A -> ExpA -> 10 , a ->  11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
    }
}
