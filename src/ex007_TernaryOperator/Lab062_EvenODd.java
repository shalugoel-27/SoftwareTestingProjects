package ex007_TernaryOperator;

public class Lab062_EvenODd {
    public static void main(String[] args) {
        // step 1 -> input , output = data types
        // input - int
        //output - string - even odd
        int num = 0;
        // step 2 ->
        // num%2==0 even else odd
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}

// Edge cases -> negative no , float, 0

