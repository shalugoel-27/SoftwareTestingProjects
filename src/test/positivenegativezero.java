package test;

import java.util.Scanner;

public class positivenegativezero {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter any integer");
        int num = scanner.nextInt();
        if(num<0){
            System.out.println("Negative no");
        }else if(num==0){
            System.out.println("Zero");
        }else{
            System.out.println("Positive no");
        }
    }



}
