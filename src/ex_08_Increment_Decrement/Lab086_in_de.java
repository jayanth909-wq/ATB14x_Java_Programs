package ex_08_Increment_Decrement;

public class Lab086_in_de {
    public static void main(String[] args) {
        int bh = 675432;
        System.out.println(++bh + ++bh);
        //  ++a -> B -> ExpB -> 675433 , a -> 675433
        //  ++a -> B -> ExpB -> 675434 , a -> 9878
    }
}
