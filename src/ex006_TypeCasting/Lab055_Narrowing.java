package ex006_TypeCasting;

public class Lab055_Narrowing {
    public static void main(String[] args) {
        int val = 300;
      //  byte b= val; // Narrowing Implicit casting ...data lost will be there bcoz large into smaller
    byte b1 = (byte)val; // Narrowing Explicit casting
        System.out.println(b1);

// int will store the data in 32 bits format in the form of 0 and 1
        // but byte will pick up only 8 bits of data rest is lossed



    }


}
