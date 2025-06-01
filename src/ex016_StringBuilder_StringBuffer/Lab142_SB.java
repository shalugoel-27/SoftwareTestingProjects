package ex016_StringBuilder_StringBuffer;

public class Lab142_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer); // it will create only 1 string in mem bcoz it is mutable in nature

        String s1= "Pramod";
        s1= s1+ "Dutta";
        System.out.println(s1); // here 2 strings r created

        StringBuilder stringBuilder =new StringBuilder("Shalu");
        stringBuilder.append(1234);
        System.out.println(stringBuilder);
    }// append means join in the end




}
