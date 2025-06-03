package Practice;

public class Lab4 {
    public static void main(String[] args) {
        String s1=args[0];
        System.out.println(s1);
       int count=s1.length();
      System.out.println(count);
String ro ="";
for(int i=count-1;i>=0;i--){
      ro=ro+s1.charAt(i);
   System.out.println(s1.charAt(i));
}
            if(ro.equals(s1))

            {
               System.out.println("PAllindrome");
            }else{
               System.out.println("Not a pallindrome");
            }
        }








}
