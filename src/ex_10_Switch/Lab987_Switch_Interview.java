package ex_10_Switch;

import java.sql.SQLOutput;

public class Lab987_Switch_Interview {
    public static void main(String[] args) {
        char code = 'C';
        switch(code){
            case 'A':
                System.out.println("default");
                break;
            case 'B':
                System.out.println("not default");
                break;
            case 'C':
                System.out.println("food");
        }
    }
}
