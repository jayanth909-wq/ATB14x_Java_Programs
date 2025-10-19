package ex_014__Operators_BrushUp;

public class Lab02_Interview_Concat {
    public static void main(String[] args) {

        int a = 23;
        int b = 43;


        String first = "good";
        String Last = "food";

        System.out.println(first+Last+a+b); //behaves differently first operator
        System.out.println(a+b+first+Last); //behaves differently first operator
        System.out.println(first+Last+(a+b)); //BODMAS



    }
}
