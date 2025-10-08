package ex_15_Strings;

public class Lab141_String_Functions {
    public static void main(String[] args) {
        String s1 = "Food";
        String s2 = "Food";
        String s3 = new String("Food");
        String s4 = new String("Food");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1.concat(s4));
        System.out.println(s1.equals(s3));
    }
}
