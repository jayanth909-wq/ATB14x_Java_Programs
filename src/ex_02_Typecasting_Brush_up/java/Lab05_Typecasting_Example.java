package ex_02_Typecasting_Brush_up.java;

public class Lab05_Typecasting_Example {
    public static void main(String[] args) {
        int price = 200;
        float gst = 13.8f;

        int overall = price+(int)gst; // valid narrowing explicit

        float food = price + gst;
        System.out.println(overall);
        System.out.println(food);
    }
}
