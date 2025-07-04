package ex029_Exceptions;

public class Lab214_TryCatchFinally {
    public static void main(String[] args) {
        int a=1;
        int c=0;
        try {
            c=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always be executed");
        }
        System.out.println(c);
    }
}
