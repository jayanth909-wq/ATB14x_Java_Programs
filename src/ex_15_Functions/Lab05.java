package ex_15_Functions;

public class Lab05 {
    public static void main(String[] args) {

name();
String result = food();
        System.out.println(result);
        king("jayanth",65000, 97987l );

        float sweet = kingert(23.4f,31.6f,88.5f);
        System.out.println(sweet);
    }

// wop wor
    static void name(){
        System.out.println("Hi");
        System.out.println("type 1");

    }//w
    static String food(){
        System.out.println("type");
        return "okk";
    }

static void king (String name, int salary, long phoneno){
    System.out.println("your name"+ name +"my sal" + phoneno);
}
static float kingert (float a , float b , float c){
        return a+b+c;
}


}


