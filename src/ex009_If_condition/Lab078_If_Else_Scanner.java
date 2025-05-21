package ex009_If_condition;

import java.util.Scanner;

public class Lab078_If_Else_Scanner {
    public static void main(String[] args) {
        // 1st method to take i/p from user is CLI method
        // int age = Integer.parseInt(args[])
        //2. Scanner class



        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age>18)
        {
            System.out.println("You are allowed to vote");
        } else
        {
            System.out.println("Not allowed to vote");
        }
    }




}
