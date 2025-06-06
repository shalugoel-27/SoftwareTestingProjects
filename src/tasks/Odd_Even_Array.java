package tasks;

public class Odd_Even_Array {
    public static void main(String[] args) {
        int[] array = {10,20,33,45,67,88,90};
        for (int i=0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.println("Even->" +array[i]);
            }else{
                System.out.println("Odd->" +array[i]);
            }
        }
    }



}
