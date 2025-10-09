package ex_16_Arrays;

public class Lab04_Arrays {
    public static void main(String[] args) {
        int [] mraks_of_man = {23,76,65,88,55,98};

        System.out.println(mraks_of_man.length);
        System.out.println(mraks_of_man[0]);
        System.out.println(mraks_of_man[1]);
        System.out.println(mraks_of_man[2]);
        System.out.println(mraks_of_man[3]);
        System.out.println(mraks_of_man[4]);
        System.out.println(mraks_of_man[5]);

        System.out.println("   ------");


        for (int i = 0; i < mraks_of_man.length; i++) {
            System.out.println(mraks_of_man[i]);

        }

        System.out.println("enh loop");

        for (int kinhteg : mraks_of_man){
            System.out.println(kinhteg);
        }

    }
}
