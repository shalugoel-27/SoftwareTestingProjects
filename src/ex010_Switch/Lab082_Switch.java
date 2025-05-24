package ex010_Switch;

import java.util.Scanner;

public class Lab082_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no");
        int day = scanner.nextInt();


        switch (day) {
            case 1:
                System.out.println("Mon");
                break;

            case 2:
                System.out.println("Tues");
                break;
        }
// if u enter the no 5 no execption will come ...code will run successfully with no o/p

    }


}
