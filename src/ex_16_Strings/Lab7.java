package ex_16_Strings;

public class Lab7 {
    public static void main(String[] args) {
        String name = "jay";
        String name2 = "jay";

        String code = new String("super");
        String code2 = new String("Super");

        System.out.println(name == name2);
        System.out.println(code==code2);
        System.out.println(name.equals(name2));
        System.out.println(code.equalsIgnoreCase(code2));
    }
}
