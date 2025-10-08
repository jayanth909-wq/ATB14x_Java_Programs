package ex_16_String_Builder_Buffer;

public class Lab146_String_Builder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("kimger");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        StringBuilder gf = new StringBuilder("format");
        System.out.println(gf.toString());

    }
}
