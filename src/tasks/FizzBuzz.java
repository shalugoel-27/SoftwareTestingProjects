package tasks;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter any integer between 1 to 100");
//        if(scanner.hasNextInt()){
//            int num= scanner.nextInt();
//            if(num%3==0 && num%5 ==0){
//                System.out.println("FizzBuzz");
//            }else if (num%5==0){
//                System.out.println("Buzz");
//            }else if (num%3==0){
//                System.out.println("Fizz");
//
//            }else {
//                System.out.println(num);
//            }
//        }else{
//            System.out.println("Enter a valid input only");
//        }
        for(int i=1;i<=100;i++)
        {if( i%3==0 && i%5 ==0){
            System.out.println("FizzBuzz");
        }else if (i%5==0){
            System.out.println("Buzz");
        }else if (i%3==0){
            System.out.println("Fizz");

        }else {
            System.out.println(i);
        }
        }

    }




    }





