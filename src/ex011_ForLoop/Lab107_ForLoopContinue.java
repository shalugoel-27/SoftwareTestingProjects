package ex011_ForLoop;

public class Lab107_ForLoopContinue {
    public static void main(String[] args) {
        //continue means please continue skip and continue

        for (int i = 0; i < 20; i++) {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);

//it will continue further in the loop without printing 5 or after skipping 5
        }
    }



}
