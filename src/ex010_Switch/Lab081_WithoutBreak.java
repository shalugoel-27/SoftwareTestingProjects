package ex010_Switch;

import java.util.Scanner;

public class Lab081_WithoutBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no");
        int day = scanner.nextInt();


        switch (day) {
            case 1:
                System.out.println("Mon");
// in this break is missing
            case 2:
                System.out.println("Tues");


            case 3:
                System.out.println("Wed");

            case 4:
                System.out.println("Thurs");

            case 5:
                System.out.println("Fri");

            case 6:
                System.out.println("Sat");

            case 7:
                System.out.println("Sun");

            default:
                System.out.println("invalid day no !");
        }
    }
}
