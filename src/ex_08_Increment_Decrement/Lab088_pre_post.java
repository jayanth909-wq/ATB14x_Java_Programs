package ex_08_Increment_Decrement;

public class Lab088_pre_post {
    public static void main(String[] args) {
        int tide = 7865;
        //  ++a -> B -> ExpB -> 7866 , a -> 7866
        // a++ -> A -> ExpA -> 7866 , a ->  7867
        System.out.println(++tide + tide++);

    }
}
