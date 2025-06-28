package stringtest28june;

public class codingchallenge2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";
        System.out.println(s1==s2); //false
        System.out.println(s2==s3); //false
        System.out.println(s1==s3); //true

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s3)); //true
        System.out.println(s2.equals(s3)); //false

        System.out.println(s1.equalsIgnoreCase(s2)); //true

    }
}
