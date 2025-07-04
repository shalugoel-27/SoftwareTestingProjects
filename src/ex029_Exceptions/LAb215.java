package ex029_Exceptions;

import java.util.Scanner;

public class LAb215 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int v= scanner.nextInt();
        try {
            int b=10/v;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Closing SC");
        }


    }
}
