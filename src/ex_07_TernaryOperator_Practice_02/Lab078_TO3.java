package ex_07_TernaryOperator_Practice_02;

public class Lab078_TO3 {
    public static void main(String[] args) {
        int swathi = 18;
        String king = swathi > 18 ? swathi > 43 ? "cangogoa" : "elsenot" : "no";

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        System.out.println(king);



        int sachin = 24;
        String hecanmarry = sachin > 56 ? sachin > 12 ? "canmarry" : "elsenot" : "no";
        System.out.println(hecanmarry);
    }
}