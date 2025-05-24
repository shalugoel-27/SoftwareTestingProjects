package ex010_Switch;

import java.util.Scanner;

public class Lab080_Switch {
    public static void main(String[] args) {
        // we will take i/p from user for int 1 to 7
        // and tells which day it is
        //logic building formula
        //1 use scanner class to take i/p
        //2 figure out expression and day
        // 3 rough logic
        // 4 fix the logic and optimize
        // 5 edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tues");
                    break;

                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thurs");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter no only from 1 to 7 you fool !"); // for edge case scenarios


            }
        }// with the help of AI u can do code review for edge cases this is cld code review mechanism
        else {
            System.out.println("You are mad enter only int values");

        }

    }
}
