package ex012_WhileLoop;

import java.util.Scanner;

public class Lab115_WhileCheck {
    public static void main(String[] args) {
        //factorial program
        //By Logic Building Formula
        //Step-1 take i/p from user by scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial Program!");
        System.out.println("Enter the no");
        if (!scanner.hasNextInt()) //incase user enters the string
        {
            System.out.println("Enter the no and rerun the program");
    }
        int num= scanner.nextInt(); //incase of int
        int fact =1;
        if(num<=0){
            System.out.println("Factorial -> " +fact); //Factorial exists for positive no's only
        }
        if(num > Integer.MAX_VALUE)
        {
            System.out.println("Can't handle as out of bound!");
        }
        int i=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
        }



}
