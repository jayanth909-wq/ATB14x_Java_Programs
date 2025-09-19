package ex_UserInput_Practice.java;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {

        String age_string = args[0];
        System.out.println(age_string);
        int age = Integer.parseInt(age_string);
        String canivote = age >= 18 ? "yes" : "no";
        System.out.println(canivote);












       String hood = args[0];
       int good = Integer.parseInt(hood);
        System.out.println(good);
        String result = (good > 87) ?  "yes" : "n0";
        System.out.println(result);





        String hoodie = args[0];
        int pooli = Integer.parseInt(hoodie);
        String sweet = pooli > 65 ? "done" : "not done";
        System.out.println(sweet);



    }
}
