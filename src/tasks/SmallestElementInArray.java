package tasks;

import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the size of array(int)");
        int size = scanner.nextInt();
        int[] array= new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements");
            array[i] = scanner.nextInt();
        }
        System.out.println("----Print---");
                int min=array[0];
                for(int i=0;i<array.length;i++){
                    if(array[i]<min){
                        min=array[i];
                    }
                }
        System.out.println("Min no->" +min);
    }




}
