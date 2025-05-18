package ex006_TypeCasting;

public class Lab056_TypeCasting {
    public static void main(String[] args) {
        long phone = 9876543210l;
      //  short s = phone; // Narrowing implicit casting ->not possible bcoz jvm will not do it automatically so use explicit
        short s = (short)phone; // Explicit narrowing
        System.out.println(s);
    }



}
