package tasks;


public class PallindromeChecker {
    public static void main(String[] args) {
        String s1= args[0];
        System.out.println("Enter the string->" +s1);
        int s2= s1.length();
        System.out.println("Enter the length of string->" +s2);
        String rev = ""; //empty string

        for(int i=s2-1;i>=0;i--){

            rev = rev +s1.charAt(i);
            System.out.print(s1.charAt(i));

        }

         if(rev.equals(s1)){ // == means the ref location in the string
  System.out.println(" PAllindrome");
}else {
  System.out.println("Not PAllindrome");
}
        }
    }







