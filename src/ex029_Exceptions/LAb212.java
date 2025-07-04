package ex029_Exceptions;

public class LAb212 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try {
            int c=10/a;
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
