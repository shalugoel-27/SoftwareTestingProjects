package ex016_StringBuilder_StringBuffer;

public class Lab145_InterviewQuestion {
    public static void main(String[] args) {
        //reverse a string without using inbuilt function

        String input ="Shalu";
        for(int i=input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
        System.out.println("");
        StringBuffer sb= new StringBuffer(input);
        System.out.println(sb.reverse());

    }





}
