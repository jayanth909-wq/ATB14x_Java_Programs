package ex_09_If_Else;

public class Lab092_if_else_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age>18) {
            System.out.println("Qualified");
        }else{
            System.out.println("Not Qualified");
        }
    }
}
