package ex_16_Strings;

public class Lab11 {
    public static void main(String[] args) {
        String s = "kjgewf";
                char res = s.charAt(4);
        System.out.println(res);


        int abc = "abc".compareTo("ABC");
        System.out.println(abc);

        int idx = "super".lastIndexOf(3);
        System.out.println(idx);

        int deff = "javava".indexOf(4);
        System.out.println(deff);


        boolean b = "".isEmpty();
        System.out.println(b);

        String juk = String.join(new String("-z"), "java","python");
        System.out.println(juk);

        String juke = "jufd".replace("u", "h");
        System.out.println(juke);


        boolean huj = "kjhewf".startsWith("k");
        System.out.println(huj);



    }
}
