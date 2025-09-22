package ex_06_Typecasing_Practice_01;

public class Lab075_Typecasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.87f;
        //        int total1 = course+GST; // Narrowing - Implicit
        int result = course+(short)gst; //explicit narrowing

        System.out.println(result);

        float ed = course+gst; // widening implicit
        float uh = course+(float)gst; //narrowing explicit
        System.out.println(uh);

    }
}
