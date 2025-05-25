package ex010_Switch;

public class Lab089_JDK13ABV {
    public static void main(String[] args) {
// in jdk>13 only
        int itemcode = 002;
        switch (itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println(" 003");
            default -> System.out.println("Default"); //(-> replaces break in these statements)
        }
    }




}
