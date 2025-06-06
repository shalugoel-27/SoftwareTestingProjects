package ex017_Arrays;

public class Lab150_Arrays_MAxMin {
    public static void main(String[] args) {
        int[] marks ={54,75,63,55,99,14,34,18,9,25};
int max_num= give_max_num(marks);
        System.out.println("max number->" +max_num);


    }
static int give_max_num(int marks[]){
        int max= marks[0];
        for(int i=0;i< marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        return max;


        //without function
//    int[] array = {5,75,63,55,14,34,18,9,25};
//    int maxno= array[0];
//    for(int i=0;i< array.length;i++) {
//        if (array[i] > maxno) {
//            maxno = array[i];
//        }
//    }
//    System.out.println("Max no->" +maxno );

}




}
