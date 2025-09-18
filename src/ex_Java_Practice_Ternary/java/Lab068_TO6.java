package ex_Java_Practice_Ternary.java;

public class Lab068_TO6 {
    public static void main(String[] args) {
        int age = 65;
        // age = 23
        //  age < 18 ->  Minor
        //  18 < age > 65 ->  Adult
        // age > 65 -> Senior Citizen
        String result = (age < 18) ? "minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
