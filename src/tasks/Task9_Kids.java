package tasks;

import java.util.Scanner;

public class Task9_Kids {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade");
        String grade = scanner.next(); // this is imp
        grade = grade.toUpperCase(); // imp


        switch(grade) {
            case "A" : System.out.println("Excellent"); // 'A' = char but "A" = string
            break;
            case "B" : System.out.println("Very good");
            break;
            case "C" :
                System.out.println("good");
                break;
            case "D" :
                System.out.println("Needs improvement");
                break;
            case "E" :
                System.out.println("Poor");
                break;
            case "F" :
                System.out.println("Fail");
                break;
            default :
                System.out.println("Invalid grade");
        }

    }




}
