package ex011_ForLoop;

public class Lab104_greater_vs_equal {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i); //o/p= 0to10; 11times
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); // o/p =1 to10 ; 10times
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i); //o/p=0to9 ; 10times
        }

    }
}
