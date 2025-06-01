package ex016_StringBuilder_StringBuffer;

public class Lab141StringBuilder_vs_Buffer {
    public static void main(String[] args) {
        String s= "Pramod";
        String s1 = new String("Pramod");

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuilder stringBuilder = new StringBuilder("Pramod");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuffer.reverse());

    }




}
