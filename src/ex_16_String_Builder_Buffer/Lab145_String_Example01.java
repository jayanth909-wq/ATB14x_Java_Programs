package ex_16_String_Builder_Buffer;

import java.util.Locale;

public class Lab145_String_Example01 {
    public static void main(String[] args) {
        String name = "Kooker";
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(1));
        System.out.println(name.concat("kook"));
        System.out.println(name.equalsIgnoreCase("KOOKER"));
        System.out.println(name.contains("om"));
        System.out.println(name.equals("Kooker"));
        System.out.println(name.indexOf("e"));
        System.out.println(name.startsWith("Koo"));
        System.out.println(name.endsWith("ker"));
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.toLowerCase());
        System.out.println(name.replace("Koo", "zoo"));
        System.out.println(name.substring(1,4));


        String sd = "name";
        System.out.println(sd.indexOf("n"));




        System.out.println(name.compareTo("loop"));


        String hb = "      mint";
        System.out.println(hb.trim());

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);






    }
}
