package ex_06_Typecasing_Practice_01;

public class Lab072_Typecasting_02 {
    public static void main(String[] args) {
        byte nh  = 76;
        int bh = nh;
        int lk = (byte)nh;
        System.out.println(bh);
        System.out.println(lk);
        // Valid Syntax -> Widening -> Explicit Casting - not required
        // Valid Syntax -> Widening -> Implicit Casting - Automatically done.
    }
}
