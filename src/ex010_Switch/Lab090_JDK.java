package ex010_Switch;

public class Lab090_JDK {
    public static void main(String[] args) {
        // jdk >13
        int itemcode = 005;
        switch (itemcode) {
            case 001,002,003 :
                System.out.println("All of them are electronic gadget");
                break;
            case 004,005,006 :
                System.out.println("This is mech");
                break;
            default :
                System.out.println("None");
        }
    }




}
