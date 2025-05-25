package tasks;

import java.util.Scanner;

public class Task10_Months_In_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any no from 1 to 12");
        int num = scanner.nextInt();
        System.out.println("enter year");
        int year = scanner.nextInt();



            switch (num) {
                case 1:
                    System.out.println("Jan = 31days");
                    break;
                case 3:
                    System.out.println("Mar = 31days");
                    break;
                case 4:
                    System.out.println("Apr = 30days");
                    break;
                case 5:
                    System.out.println("May = 31days");
                    break;
                case 6:
                    System.out.println("Jun = 30days");
                    break;
                case 7:
                    System.out.println("July = 31days");
                    break;
                case 8:
                    System.out.println("Aug = 31days");
                    break;
                case 9:
                    System.out.println("Sept = 30days");
                    break;
                case 10:
                    System.out.println("Oct = 31days");
                    break;
                case 11:
                    System.out.println("Nov = 30days");
                    break;
                case 12:
                    System.out.println("Dec = 31days");
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        System.out.println("Leap year =29days");
                    } else {

                        System.out.println("Feb=28days");
                    }
break;
                default:
                    System.out.println("Enter a valid no btwn 1 to 12 only");
            }


        }

    }




