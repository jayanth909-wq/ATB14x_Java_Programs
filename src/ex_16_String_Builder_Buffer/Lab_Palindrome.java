package ex_16_String_Builder_Buffer;

public class Lab_Palindrome {
    public static void main(String[] args) {
        String input = "madam";

        String hunt = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            hunt = hunt + input.charAt(i);

        }
        if (hunt.equalsIgnoreCase(input)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not");
        }
    }
}
