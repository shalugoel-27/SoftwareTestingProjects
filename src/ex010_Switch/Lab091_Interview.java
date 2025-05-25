package ex010_Switch;

public class Lab091_Interview {
    public static void main(String[] args) {
        int a = 10; // this is fake just to confuse
        switch (-1) {
            default :
                System.out.println("Default");
                break;
            case -1 :
                System.out.println("10"); // o/p = 10 .....-1 will match with -1
                break;
            case 9 :
                System.out.println("9");
        }
    }



}
