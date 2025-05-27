package ex013_DoWhileLoop;

public class Lab118_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a=0;
        while(a<0){
            System.out.println(a); //o/p = nothing
            a++;
        }
        //same program using do while

        do{
            System.out.println(a);
            a++;
        }while (a<0); //o/p =0


    }






}
