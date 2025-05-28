package ex014_Functions;

import java.util.Scanner;

public class Lab124_UD_P1 {
    public static void main(String[] args) {

        wp_wr_greet(); // 1st    method called

        String msg = greet_wp_WR(); //2nd method called
        System.out.println(msg);

        greet_with_details("shalu", 35, 100); //3rd method called mostly used
greet_with_details("pramod",40,10000);

Scanner scanner = new Scanner(System.in); // if u want to take i/p from user
        System.out.println("Enter your name");
        String name= scanner.next();
        System.out.println("Enter your age");
        int age= scanner.nextInt();
        System.out.println("Enter your salary");
        double salary= scanner.nextDouble();
        greet_with_details(name, age, salary); //called

        int sum= sum_of_num(77,11,3); //4th method called
        float sum1 =sum_of_three_number(2022f,1.11f ,40.50f);
        System.out.println(sum);
        System.out.println(sum1);
    }
//1. without parameter without return type

    static void wp_wr_greet(){
        System.out.println("Hi, how are you?");
    }

//2. without parameter with return type

    static String greet_wp_WR(){
        System.out.println("Hi");
        return "How are you";
    }

//3. with parameter without return type

    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is->" +name+ "\nyour age is->" +age+ "\nyour salary is->" +salary);
    }
//4. with parameter with return type

    static int sum_of_num(int a, int b, int c){
        return a+b+c;
    }

static float sum_of_three_number(float a, float b, float c){
        return a+b+c;
}
}
