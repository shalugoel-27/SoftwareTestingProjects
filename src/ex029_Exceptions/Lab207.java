package ex029_Exceptions;

public class Lab207 {
    public static void main(String[] args) {
        System.out.println("Start the program");

        String ip =args[0];
        int a= Integer.parseInt(ip);
        int b=100/a;

        System.out.println(b);
        System.out.println("End the program");
    }
}
//this program is good at compile time but may have error during runtime-
// 1. if u dont enter any i/p - Arrayindexout ofbound exception
//2. if u enter string instead of integer - Numberformatexception
//3. if u enter 0 -Arithmetic exception
//so likeways this simple program has three xceptions avail but it can be handled