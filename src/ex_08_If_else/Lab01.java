package ex_08_If_else;

public class Lab01 {
    public static void main(String[] args) {

        String hut = args[0];
        System.out.println(hut);
        int myage = Integer.parseInt(hut);
        System.out.println(myage);


        if (myage <= 54) {
            System.out.println("young enough");
        }
        else {
            System.out.println("old");

        }

    }
}
