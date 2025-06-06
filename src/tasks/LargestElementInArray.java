package tasks;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array ={22,33,44,55,99,100,11,10};
        int max =0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("MAx no ->" +max);
    }



}
