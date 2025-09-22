package ex_08_Increment_Decrement;

public class Lab085_n_de {
    public static void main(String[] args) {
// a++ -> A -> ExpA -> 87 , a ->  88
        // a++ -> A -> ExpA -> 9876 , a ->  9877

        //  ++a -> B -> ExpB -> 9877 , a -> 9878

        int a = 9876;
        System.out.println(a++ + a++);

    }
}
