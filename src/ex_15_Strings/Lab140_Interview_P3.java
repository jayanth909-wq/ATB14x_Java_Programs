package ex_15_Strings;

public class Lab140_Interview_P3 {
    public static void main(String[] args) {
        String s1 = "hood";
        String s2 = "Hood";

        // == -> Comparison -> String => this check the ref location

        String s3 = new String("hood");
        String s4 = new String("Hood");
        String s5 = new String("hoodie");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s4==s5);

        System.out.println(s3.equalsIgnoreCase(s4));

        // equals ( content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s1.equals(s2));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value



    }
}
