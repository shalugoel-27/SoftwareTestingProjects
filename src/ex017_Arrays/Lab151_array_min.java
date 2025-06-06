package ex017_Arrays;

public class Lab151_array_min {
    public static void main(String[] args) {
        int[] array= {12,34,55,23,67,99};
        int minno =give_min_num(array);
        System.out.println("Min no->" +minno);

    }
static int give_min_num(int[] array){
        int min =array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min= array[i];
            }
        }
        return min;
}



}
