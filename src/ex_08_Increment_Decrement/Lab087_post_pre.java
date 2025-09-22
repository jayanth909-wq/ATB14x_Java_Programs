package ex_08_Increment_Decrement;

public class Lab087_post_pre {
    public static void main(String[] args) {
        int lk = 3437643;
        // a++ -> A -> ExpA -> 3437643 , a ->  3437644
        //  ++a -> B -> ExpB -> 3437645 , a -> 675433
        System.out.println(lk++ + ++lk);




    }
}
