package ex012_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Lab116_whileGuessingGame {
    public static void main(String[] args) {
// user will guess a no btwn 1 to 100
       // u have to tell > or < that that
                //logic building formula
        Random random = new Random(); // class to enter random num
        int NumToGuess = random.nextInt(100)+1;
        //here bound 100 means it is bound to 100 it will take values till 99 ..so +1 =100
        //System.out.println(NumToGuess);
        //if i write ("NumToGuess") it will print NumToGuess but if i write without commas then it will give the value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any no btwn 1 to 100");
        int guess;
        int attempts=0;
        while(true){
            if(!scanner.hasNextInt()){
                System.out.println("Invalid input");
                scanner.next(); // if we dont use this it will continue till infiite printing invalid i/p
                continue;
            }
            guess= scanner.nextInt();
            attempts++;

            if(guess<1 || guess>100){
                System.out.println("Please enter a valid no only");
                continue;
            }
            if(guess>NumToGuess){
                System.out.println("Too high, try again");
        }else if (guess<NumToGuess){
                System.out.println("Too Low, try again");
            } else{
                System.out.println("Correct! You have guessed it in" +attempts+ "attempts");
                break;
            }

            }

    }





}
