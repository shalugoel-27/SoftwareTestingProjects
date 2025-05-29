package tasks;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value from 0 to 100");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num >= 90 && num <= 100) {
                System.out.println("Grade A");
            } else if (num >= 80 && num <= 89) {
                System.out.println("Grade B");
            } else if (num >= 70 && num <= 79) {
                System.out.println("Grade C");

            } else if (num >= 60 && num <= 69) {
                System.out.println("Grade D");
            } else if (num > 50 && num <= 59) {
                System.out.println("Grade E");
            } else if (num >= 0 && num <= 50) {
                System.out.println("Grade F");
            } else {
                System.out.println("Enter a valid input");
            } }
            else{
                System.out.println("Enter a valid int only and rerun");
            }
        }


}




