package ex015_Strings;

public class Lab138_Substring {
    public static void main(String[] args) {
        String s= "Java".substring(2);
        System.out.println(s); // va

        String s1 ="Java".substring(1,3);
        System.out.println(s1); //av

        String s2 ="unhappy".substring(2);
        System.out.println(s2); //happy

        String s3 ="emptiness".substring(9);
        System.out.println(s3); // nothing

        char[] arr = "Java".toCharArray();
        System.out.println(arr); // 'j' 'a' 'v' 'a'

        String s4 = " Java ".trim(); //removes the spaces of start and end
        System.out.println(s4);

        boolean b = "    ".isBlank();
        System.out.println(b); // true

        String s5 ="ab".repeat(3);
        System.out.println(s5); // ababab

        boolean b1 = "JAVA".equalsIgnoreCase("java");
        System.out.println(b1); // true

        String s6 = String.format("%s = %d" ,"age" , 25);
        System.out.println(s6);

        long count ="a\nb\nc\nd".lines().count();
        System.out.println(count);

    }





}
