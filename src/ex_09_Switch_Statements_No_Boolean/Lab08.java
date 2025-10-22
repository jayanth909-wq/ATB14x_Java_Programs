package ex_09_Switch_Statements_No_Boolean;

public class Lab08 {
    public static void main(String[] args) {
        int index = 2;

        switch (index){
            case 1,2,3:
                System.out.println("odd");
                break;

            case 4,5,6:
                System.out.println("even");
                break;
            default:
                System.out.println("None");


        }

    }
}
