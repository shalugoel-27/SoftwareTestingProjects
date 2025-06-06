package ex017_Arrays;

import java.util.Arrays;

public class Lab155_2ndHighNoArray {
    public static void main(String[] args) {
        int[] numbers = {12,34,10,1,100,3,4}; // High =100 ; 2nd high =34
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }




}
