package tasks;

import java.util.Scanner;

public class ReverseStringUsingFunct {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();

        StringBuffer sb= new StringBuffer(input);
        System.out.println(sb.reverse());
    }



}
