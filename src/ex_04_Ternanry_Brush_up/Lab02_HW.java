package ex_04_Ternanry_Brush_up;

public class Lab02_HW {
    public static void main(String[] sweet) {

        String user_input = sweet[0];

        int age = Integer.parseInt(user_input);

        String restrict = age < 18 ? "minor" : age < 60 ? "majore" : "senor";

        System.out.println(restrict);

    }
}
