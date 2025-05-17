package ex004_literals;

public class Lab031_CharLiterals {
    public static void main(String[] args) {
        char c='A'; // A to z, a to z, Special symbols
       // char c1 = "A"; // " " == String -> Bunch of char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '1';
        char c6 = '(';
        char c7 = ' ';// blank space

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return ='\r'; //backspace and carriage return are rarely used

        System.out.println("Pramod+new_line+Dutta");
        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("Pramod\nDutta");
        System.out.println("Pramod"+tab_line+"Dutta");
        System.out.println("Pramod"+back_space+"Dutta");// works like a backspace key
        System.out.println("Pramod"+carriage_return+"Dutta"); // works like a del key " Pramod is deleted

char c10 = 'A'; // ASCII A->65
        char rupees = '$';
        System.out.println(rupees);

        char my_laugh_smily ='\u1f60';
        System.out.println(my_laugh_smily);







    }



}
