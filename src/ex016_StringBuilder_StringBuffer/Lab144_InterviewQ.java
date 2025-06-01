package ex016_StringBuilder_StringBuffer;

public class Lab144_InterviewQ {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("JAva");
        stringBuffer.append(" Programming");
        System.out.println(stringBuffer);

        stringBuffer.delete(5,16); // del from 5 to 16
        System.out.println(stringBuffer); // JAva

        stringBuffer.replace(0,4,"C++");
        System.out.println(stringBuffer);

    }




}
