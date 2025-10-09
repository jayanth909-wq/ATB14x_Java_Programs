package ex_16_Arrays;

public class Lab01_Array {
    public static void main(String[] args) {
        int h = 87;
        int hunt[] = {12, 45, 87, 65, 13, 87, 63};

        boolean[] hengae = {true, true, false};

        System.out.println(hunt.length);
        System.out.println(hengae);
        System.out.println(hunt[5]);
        System.out.println(hunt[3]);

        System.out.println(hunt[1]); //java.lang.ArrayIndexOutOfBoundsException

        String moon = "kinger";
        String[] food = moon.split("");

        for (String s : food) {
            System.out.println(s);
        }
        System.out.println(food);
    }


    String jinv = "Eating";
    String[] superrt = jinv.split("");{


        for (String h : superrt){
            System.out.println(h);
    }
        System.out.println(superrt);


    }
}
