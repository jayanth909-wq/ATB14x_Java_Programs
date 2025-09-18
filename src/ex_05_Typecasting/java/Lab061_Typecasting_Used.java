package ex_05_Typecasting.java;

public class Lab061_Typecasting_Used {
    public static void main(String[] args) {
        int fees = 224;
        float gst = 18.24f;
        //int total = fees + gst // implicit narrowing
        int totalw = fees+(int)+gst;
        System.out.println(totalw); // explicit narrowing


        float sweet = fees+gst; //widening
        float spicy = fees+(float)gst;
        System.out.println(sweet);
        System.out.println(spicy);


        long lop = 9876576463349l;
        int b = (int)lop; //Explicit narrowing
        System.out.println(b);

        byte hb = 126;
        int bh = hb; // Implicit widening
        byte kj = (byte)hb;
        System.out.println(kj);
        System.out.println(bh);




    }
}
