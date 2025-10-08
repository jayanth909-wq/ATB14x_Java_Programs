package ex_16_String_Builder_Buffer;

public class Lab147_String_02 {
    public static void main(String[] args) {
        // String - 90%
        String ij = "Looper";
        String jh = new String("looper");

        //less than 10%
        StringBuilder builder = new StringBuilder("king");
        StringBuffer hufer = new StringBuffer("super");

        System.out.println(builder);
        System.out.println(hufer);
        System.out.println(builder.reverse());
        System.out.println(hufer.reverse());
    }
}
