package ex_16_String_Builder_Buffer;

public class Lab151_SB_2 {
    public static void main(String[] args) {
        StringBuffer jingert = new StringBuffer("king");
        jingert.append(" of jungle");
        System.out.println(jingert);

        jingert.replace(0, 2,"lp");
        System.out.println(jingert);
    }
}
