package ex_10_if_else_Practice;

public class Lab_095_If_Condition {
    public static void main(String[] args) {
        String joking_input = args[0];
        System.out.println(joking_input);
        int age = Integer.parseInt(joking_input);

        if(age<16){
            System.out.println("not allowed");
        }
        else{
            System.out.println("allowed");
        }
    }
}
