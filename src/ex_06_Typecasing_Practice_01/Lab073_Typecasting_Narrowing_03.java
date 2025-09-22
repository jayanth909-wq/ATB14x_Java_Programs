package ex_06_Typecasing_Practice_01;

public class Lab073_Typecasting_Narrowing_03 {
    public static void main(String[] args) {
        int joke = 654;

        //     **0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0**


//        byte b = val; // Narrowing - Implicit Casting - Vaid ? No

        byte sp = (byte)joke;
        System.out.println(sp);

        //  **0 0 1 0 1 1 0 0**
        // Value is
        //
        // 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = **44.**
        //
        //**(00101100)₂ = (0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) + (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)₁₀**



    }
}
