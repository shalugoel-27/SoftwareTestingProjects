package ex017_Arrays;

public class Lab156_2ndHighNoinArray {
    public static void main(String[] args) {
        int [] numbers ={11,23,75,10,20,55,33};
        int highest =0; //in case of negative no's int highest=Int.MinValue
        int secondHighest=0;
        for(int num : numbers){
            if(num>highest){
                secondHighest = highest;
                highest= num;

            }else if(num>secondHighest && num !=highest){
                secondHighest =num;
            }
        }
        System.out.println(secondHighest);
    }





}
