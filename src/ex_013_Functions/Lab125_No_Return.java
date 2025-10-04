package ex_013_Functions;

public class Lab125_No_Return {
    public static void main(String[] args) {
        String name = what_are_you_doing();
        System.out.println(name);
        noreturntype();
        lop_pol();
        kid();
        ij();

    }

    static void noreturntype() {
        System.out.println("nothing");
    }

    // return type can be anything (int, string, float,)

    static String what_are_you_doing() {
        System.out.println("return");
        return "food";
    }

    static boolean lop_pol() {
        return true;

    }

    static float kid() {
        return 3.14f;
    }
    static byte ij() {
        System.out.println("side");
        return 12;


    }
}

