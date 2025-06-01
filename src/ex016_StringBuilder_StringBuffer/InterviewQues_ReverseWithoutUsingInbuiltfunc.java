package ex016_StringBuilder_StringBuffer;

public class InterviewQues_ReverseWithoutUsingInbuiltfunc {
    public static void main(String[] args) {
        String s= "Pramod";
        // reverse -> domarP

        for(int i=s.length()-1; i>=0;i--){
           // System.out.println(s.charAt(i));
            System.out.print(s.charAt(i));
        }
    }



}
