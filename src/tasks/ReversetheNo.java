package tasks;

import java.util.Scanner;

public class ReversetheNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();

        int reverseno = 0;
        if (num == 0) {
            System.out.println("enter a valid input");
        }
while(num!=0){

            int digit = num % 10; // last digit

                    reverseno = reverseno * 10 + digit; //first digit of reverse no
                    num = num / 10; //quotient of rest of the no except the last digit
                }
    System.out.println("Reverse no->" + reverseno);
            }



        }
