package ex_07_TernaryOperator_Practice_02;

public class Lab081_T06 {
    public static void main(String[] args) {
        int yh = 98;
        int uh = 54;
        int nj = -987;
        String result = yh > uh ? yh > nj ? "yh" : "nj" : uh > yh  ? "uh" : "nj";
        // LBF
        // Logic Building Formula

        // Step 1 ->  Find the inputs and outputs data type.
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can message with max number.


        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 ->  n1
        //  n2 > n3 && n2 > n1 -> n2
        //  n3
        System.out.println(result);

    }
}
