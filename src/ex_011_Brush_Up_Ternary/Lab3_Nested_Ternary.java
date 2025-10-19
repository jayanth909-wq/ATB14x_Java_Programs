package ex_011_Brush_Up_Ternary;

public class Lab3_Nested_Ternary {
    public static void main(String[] args) {

        int age = 19;

        String pooja = (age > 18) ? (age > 25) ? "can go" : "canot" : "no";
        System.out.println(pooja);
    }
}
