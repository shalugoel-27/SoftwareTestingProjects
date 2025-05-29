package ex014_Functions;

import java.util.Scanner;



public class Lab127_UserDefined {
    public static void main(String[] args) {
//In reference to lab 126
        Scanner scanner= new Scanner(System.in);
        int a= readInt(scanner, "Enter the num1");
        int b= readInt(scanner, "Enter the num2");

        int result_sum= sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);



    }
static int readInt(Scanner scanner, String prompt ){
    System.out.println(prompt);
    if(scanner.hasNextInt()){
        return scanner.nextInt();
    }else{
        System.out.println("Enter an int only");
        System.exit(0);
        return -1;
    }


}

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;

    }

    static int mul(int a,int b){
        return a*b;
    }

    static int div(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;

    }

    static int mod(int a, int b){
        return a%b;
    }





}
