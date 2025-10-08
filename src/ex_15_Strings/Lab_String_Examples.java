package ex_15_Strings;

public class Lab_String_Examples {
    public static void main(String[] args) {
        String jhu = "orphan";
        char v = jhu.charAt(4);
        System.out.println(v);


        int forbid = "jing".compareTo("jing");
        System.out.println(forbid);

        int hi = "orphan".indexOf("h");
        System.out.println(hi);

        int bye = "kingness".lastIndexOf("s");
        System.out.println(bye);

        boolean bh = "".isEmpty();
        System.out.println(bh);


        String jn = String.join("+", "nightowl", "mornig");
        System.out.println(jn);

        String lk = "Kinger".replace("in", "on");
        System.out.println(lk);

        boolean k = "loops".startsWith("lo");
        System.out.println(k);

        String nj = "moon".concat("king");
        System.out.println(nj);
    }
}
