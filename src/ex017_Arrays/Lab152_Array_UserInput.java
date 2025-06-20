package ex017_Arrays;

import java.util.Scanner;
import java.util.StringJoiner;

public class  Lab152_Array_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array(int)");
        int size = scanner.nextInt();
        String[] number_marks =new String[size];
        //float[] number_marks =new float[size];
      //  int[] number_marks =new int[size];
        for(int i=0;i<number_marks.length;i++){
            System.out.println("Enter the elements");
            number_marks[i]=scanner.next();


        }
        System.out.println("-----Print the values----");
        for(String mark : number_marks){
            System.out.println(mark);
        }

        scanner.close();
    }



}
