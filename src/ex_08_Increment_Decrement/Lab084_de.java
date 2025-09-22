package ex_08_Increment_Decrement;

import java.sql.SQLOutput;

public class Lab084_de {
    public static void main(String[] args) {
        int ok = 87;
        int result = (ok++ + ++ok);
        // a++ -> A -> ExpA -> 87 , a ->  88
        // a++ -> A -> ExpA -> 89 , a ->  79

      //  ++a -> B -> ExpB -> 12 , a -> 12
        System.out.println(result);



    }
}
