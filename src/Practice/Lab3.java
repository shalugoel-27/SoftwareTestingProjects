package Practice;

public class Lab3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("%d-> FizzBuzz\n", i);
            } else if (i % 3 == 0) {
                System.out.printf("%d-> Fizz\n", i);
            } else if (i % 5 == 0) {
                System.out.printf("%d-> Buzz\n", i);
            }else System.out.println(i);
        }


    }



}
