package ex015_Strings;

public class LAb134_InterviewP2 {
    public static void main(String[] args) {
        String s1 ="Hello";
        String s4 ="Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        //== -> Comparison ->Strings - this checks the refrence location
        System.out.println(s1==s3); // false
        System.out.println(s1== s2); // false
        System.out.println(s2 == s3); //false
        System.out.println(s1 == s4); //true
        System.out.println(s3== s5); // false

        //equals(this checks for the content not the location) -> value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5)); //it will ignore h & H nd gives true as o/p

    }




}
