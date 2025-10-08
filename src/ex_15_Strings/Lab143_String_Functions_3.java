package ex_15_Strings;

public class Lab143_String_Functions_3 {
    public static void main(String[] args) {
        String fd = "looper".substring(3);
        System.out.println(fd);

        String hg = "sweetest".substring(3);
        System.out.println(hg);


        String hy = "kingofking".substring(5);
        System.out.println(hy);

        String gv = "ternery".substring(1,3);
        System.out.println(gv);

        char[] arr = "swiniging".toCharArray();
        System.out.println(arr);

        String lop = " owl ".trim();
        System.out.println(lop);


        boolean h = "    ".isBlank();
        System.out.println(h);

        String jin = "super".repeat(3);
        System.out.println(jin);

        boolean e = "King".equalsIgnoreCase("king");
        System.out.println(e);

        long count = "s/da/f".lines().count();
        System.out.println(count);
    }


}
