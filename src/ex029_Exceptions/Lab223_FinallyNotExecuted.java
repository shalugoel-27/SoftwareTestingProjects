package ex029_Exceptions;

public class Lab223_FinallyNotExecuted {
    public static void main(String[] args) {
        try {
            int a=10/10;
            System.out.println(a);
            System.exit(0); // this can stop the execution of finally
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Hello");
        }
    }
}
