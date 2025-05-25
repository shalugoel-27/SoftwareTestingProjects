package ex011_ForLoop;

public class Lab108_ForLoopContinueEvenNo {
    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            if(i%2==0) // or opp we can do (i%2!=0) for printing even no
            {
                continue;
            }
            System.out.println("Odd->" +i);
        }
    }
// it is skipping the even no's nd printing the odd no

}
