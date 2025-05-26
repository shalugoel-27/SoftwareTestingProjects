package ex012_WhileLoop;

public class Lab110_While {
    public static void main(String[] args) {
        int i= 0; // initialization can be outside
        while(i<10) {
            //condition must be true to enter into the loop
            System.out.println(i);
            i++; // updation in the end
        }
        for(int j=0;j<10;j++)
        {
            System.out.println(j);
        }
    }// both o/p are exactly same 0 to 9



}
