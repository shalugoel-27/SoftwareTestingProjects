package tasks;

import java.util.Scanner;

public class StringAPallindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();
        String output ="";
        for(int i=input.length()-1;i>=0;i--){
            output =output+input.charAt(i);
            System.out.println(input.charAt(i));
        }
        if(output.equalsIgnoreCase(input)){
            System.out.println("String is PAllindrome");
        }else{
            System.out.println("Not a PAllindrome");
        }
    }




}
