package ex_16_Arrays;

public class Lab03_Arrays {
    public static void main(String[] args) {
        String[] punya = {"swathi", "sachin", "punyashree"};
        System.out.println(punya.length);
        System.out.println(punya[2]);
        System.out.println(punya[1]);
        System.out.println(punya[0]);




        String[] jinx = new String[3];

        System.out.println(jinx.length);

        jinx[2]= "lkio";
        jinx[0] = "lio";
        jinx[1] = "future";

        System.out.println(jinx[0]);
        System.out.println(jinx[1]);
        System.out.println(jinx[2]);


        boolean [] is_good = new boolean[2];
        is_good[0] = false;
        is_good[1] = true;

        System.out.println(is_good[0]);

    }
}
