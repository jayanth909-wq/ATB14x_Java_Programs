package ex_16_String_Builder_Buffer;

public class Lab148_String_Buffer_03 {
    public static void main(String[] args) {
        StringBuffer goodboy = new StringBuffer("Queen");
        goodboy.append("food");
        System.out.println(goodboy);


        String hg = "moon";
        hg = hg + "sun";
        System.out.println(hg);
    }
}
