package tasks;

import java.util.Scanner;

public class Factorial_for_n {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the no");
        int num = scanner.nextInt();
        int fact =1;

         if(num<0)
        {
            System.out.println("it is a negative no");
        } else
        {
           // for(int i=num; i>0;i--)
            for(int i=1; i<=num;i++)
            {
                fact=fact*i;
            }
            System.out.println("FActorial is" +fact);
        }
    }


    }





