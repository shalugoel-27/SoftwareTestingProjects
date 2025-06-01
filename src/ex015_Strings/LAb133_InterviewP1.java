package ex015_Strings;

public class LAb133_InterviewP1 {
    public static void main(String[] args) {
        String s1 = "Hello"; // 1string in SCP
        String s4= "Hello"; // still only 1 string in SCP both will pt to the same
        String s10 ="Hello"; //still 1
        String s11 ="hello"; // now 2 in SCP

        String s2 = new String("Hello"); //1 string in OA
        String s3 = new String("Hello"); //now 2 string in OA bcoz new operator will always create a new mem
String s5 = new String("hello"); // now 3 in OA


    }




}
