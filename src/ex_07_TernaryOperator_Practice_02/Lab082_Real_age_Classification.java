package ex_07_TernaryOperator_Practice_02;

public class Lab082_Real_age_Classification {
    public static void main(String[] args) {
        int age = 18;
        String result = age < 18 ? "minor" : age < 65 ? "major" : "sr.citizen";
        System.out.println(result);
    }
}
