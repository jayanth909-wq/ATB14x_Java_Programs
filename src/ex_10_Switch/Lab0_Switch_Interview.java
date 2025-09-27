package ex_10_Switch;

public class Lab0_Switch_Interview {
    public static void main(String[] args) {
        int bug = 876;
        switch (bug){
            case 54,11,76:
                System.out.println("part of it");
                break;
            case 875,878:
                System.out.println("not a part");
                break;
            default:
                System.out.println("graded out");
        }
    }

}