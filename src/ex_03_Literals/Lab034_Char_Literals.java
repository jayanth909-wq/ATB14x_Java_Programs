package ex_03_Literals;

public class Lab034_Char_Literals {
    public static void main(String[] args) {
        char c1 = 'A'; //A-Z in '' Format and '@#$%&'
        char r = 'b';
        char r5 = 'c';
        char t7 = 'd';
        char y98 = 'e';

        char a2 = '&';
        char a8 = '%';
        char $3 = '#';
        char e2 = '@';
        char yu = ' ';
        char po = '_';

// Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("prince"+tab_line+"king");
        System.out.println("opus"+back_space+"magnum");
        System.out.println("punya"+carriage_return+"Rahul");
        System.out.println("pramod"+new_line+"good"+new_line+"food");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char rupees = '$';
        System.out.println(rupees);

        char good_food = '\u1f60';
        System.out.println(good_food);

        char c11  = '\u1F60';
      }
}
