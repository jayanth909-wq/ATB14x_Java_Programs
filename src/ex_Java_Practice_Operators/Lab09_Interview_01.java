package ex_Java_Practice_Operators;

public class Lab09_Interview_01 {
    public static void main(String[] args) {
        long gross_salary = 98765l;
        boolean expected_salary = !(gross_salary > 22222222) || (gross_salary > 100000);
        System.out.println(expected_salary);

        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}
