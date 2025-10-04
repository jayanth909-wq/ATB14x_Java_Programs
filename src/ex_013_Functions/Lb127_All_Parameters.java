package ex_013_Functions;

public class Lb127_All_Parameters {
    public static void main(String[] args) {
ok_ok();
String name = nij_kij();
        System.out.println(name);
        greet_with_details("Pramod", 65, 100);
        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type
int sum = height(12,24,98);
        float opus = go_go(12,23,3);

        System.out.println(sum);
        System.out.println(opus);
    }
    // 1.Without Parameters and Without Return Type
    static void ok_ok(){
        System.out.println("where");
        System.out.println("uyt");
    }
    // 2.Without Parameters but With Return Type
    static String nij_kij(){
        return "hello";
    }

    // 3.With Parameters and Without Return Type
    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Jayanth" + age + salary);
    }
    static int height(int a, int b, int d) {
        return a+b+d;
    }
    static float go_go(int z, int y, int x){
        return z+y+x;
    }
}
