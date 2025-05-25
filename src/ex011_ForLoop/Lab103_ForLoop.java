package ex011_ForLoop;

public class Lab103_ForLoop {
    public static void main(String[] args) {
       // for(int i = -1 ; i<-10 ; i--) // no o/p bcoz cond is false
        for(int i =-1; i>-10 ; i--) // o/p= -1 to -9
        {
            System.out.println(i);
        }
int i=10; // initialization is outside so valid no problma
        for( ; i>0;i--)
        {
            System.out.println(i);
        }
    }




}
