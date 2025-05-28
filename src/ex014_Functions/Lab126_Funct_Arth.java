package ex014_Functions;

import java.util.Scanner;

public class Lab126_Funct_Arth {
    public static void main(String[] args) {
        //create a funct of sum,sub,mult,div
        //take i/p from user with parameter a,b
        /** Logic building formula
         * 1. i/p - int -scanner class
         * 2. o/p -var int
         * 3. rough logic use type 4th function with para with return
         *4. edge cases **/

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the num1");
        int a=0;
        if(scanner.hasNextInt()) {
            a = scanner.nextInt();
        }else {
            System.out.println("Enter the integer only");
            System.exit(0);
        }
        System.out.println("Enter the num2");
        int b=0;
        if(scanner.hasNextInt()){
            b= scanner.nextInt();
        }else{
            System.out.println("Enter the int only");
            System.exit(0);
        }

// same code has been repeated two times so we can make a function of this
    }


}
