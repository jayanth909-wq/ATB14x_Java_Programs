package ex_16_String_Builder_Buffer;

public class Lab_Practice {
    public static void main(String[] args) {
        String hut = "naman";

        String lock = "";

        for (int i = hut.length()-1; i >= 0 ; i--) {
            lock = lock + hut.charAt(i);

        }
        if(lock.equalsIgnoreCase(hut)){
            System.out.println("pal");
        }else{
            System.out.println("not");
        }
    }
}
