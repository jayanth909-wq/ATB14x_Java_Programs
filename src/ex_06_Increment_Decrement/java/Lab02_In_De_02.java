package ex_06_Increment_Decrement.java;

public class Lab02_In_De_02 {
    public static void main(String[] args) {
        int c = 42;
        System.out.println(++c + ++c);
        System.out.println(c);
        // a++ -> A -> ExpA -> 77 , a ->  78
        // a++ -> A -> ExpA -> 78 , a ->  79

        // ++a -> A -> ExpA -> 43 , a -> 43
        // +l
        // ++a -> B -> ExpB -> 44 , a -> 44
    }
}
