package ex015_Strings;

public class Lab135_Strings_Functions {
    public static void main(String[] args) {
        String s1 ="Hello";
        String s2 ="Hello";
        String s3 =new String("Hello");
        System.out.println(s1==s2); // true same loc

        System.out.println(s1==s3); // false diff loc
        System.out.println(s1.equals(s3)); //true content same
        System.out.println(s1.concat(s3)); //HelloHello in SCP
    }




}
