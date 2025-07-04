package ex029_Exceptions;

public class Lab211 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try {
            int c=10/b;
        } catch (ArithmeticException e) { // small basket
            System.out.println(e.getMessage());
        }
        //or u can also write
        catch (Exception e) { // big basket to catch exception
            System.out.println(e.getMessage());
        }

    }
}
