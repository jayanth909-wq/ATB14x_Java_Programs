package ex_16_Strings;

public class Lab10 {
    public static void main(String[] args) {
        String s =  "defraoxwe".substring(5);
        System.out.println(s);
        String g3 = "superhuman".substring(5,7);
        System.out.println(g3);

        char arr[] = "hub".toCharArray();
        System.out.println(arr);

        String gh = "    java".trim();
        System.out.println(gh);

        boolean b  = "    ".isBlank();
        System.out.println(b);

        String s3 = "ab".repeat(4);
        System.out.println(s3);

        boolean bh = "Jva".equalsIgnoreCase("jva");
        System.out.println(bh);

        long count = "a/v/v/".lines().count();
        System.out.println(count);
    }
}
