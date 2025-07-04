package ex029_Exceptions;

public class Lab216 {
    public static void main(String[] args) {
        try {
            String ip = args[0]; //arrayindexoutofbound
            int a =Integer.parseInt(ip); // NumberFormatException
            int b=100/a; //ArithmeeticException
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            //rather than writing all the exceptions individually it is a good practice to write it together with or cond
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always be called");
        }

    }
}
