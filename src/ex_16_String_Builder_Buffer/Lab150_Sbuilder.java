package ex_16_String_Builder_Buffer;

public class Lab150_Sbuilder {
    public static void main(String[] args) {
        StringBuilder foober = new StringBuilder("hifer");
        foober.append(" goofer");
        foober.reverse();
        System.out.println(foober);
    }
}
