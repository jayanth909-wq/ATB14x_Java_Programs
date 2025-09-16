package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
        boolean b = true;
        boolean c = false;
        boolean result =  b != c;
        System.out.println(result);

        boolean d = false;
        System.out.println(!d);

        boolean hb = true;
        System.out.println(!!hb);

        boolean cd = true || false;
        System.out.println(cd);

        boolean po = false && true;
        System.out.println(po);

    }
}
