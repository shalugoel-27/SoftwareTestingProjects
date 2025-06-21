package test;

import java.util.Scanner;

public class factorialusingwhileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer");
        int n=scanner.nextInt();
        int factorial =1;
        while(n!=0){
            factorial= factorial*n;
            n--;
        }
        System.out.println(factorial);
    }


}
