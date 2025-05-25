package ex011_ForLoop;

public class Lab106_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
          //System.out.println(i); // o/p =0,1,2,3,4,5
            if(i==5)
            {
               // System.out.println(i); //o/p= 5
                break;
            }
            System.out.println(i); // o/p =0,1,2,3,4
        }
    }



}
