package ex015_Strings;

public class Lab136_StringExamples {
    public static void main(String[] args) {
        String s ="JAVA";
        char c= s.charAt(2); // index= 0 ,1,2
        System.out.println(c); // V

        System.out.println(s.codePointAt(0)); // it gives the unicode char of J =74


        // CompareToIgnore (String Sr)
        int result = "abc".compareTo("ABC");
        System.out.println(result); // diff of their ASCII values
        int result1 = "abc".compareToIgnoreCase("ABC");
        System.out.println(result1); // o/p = 0

        int idx= "Java".indexOf("a"); // index of first a=1
        System.out.println(idx);

        int idx1 ="Java".lastIndexOf("a"); //3
        System.out.println(idx1);

        boolean b ="".isEmpty();
        System.out.println(b); //true

        String s11= String.join("*","Java", "Python");
        System.out.println(s11); // Java*Python
        // concat and join are very similar but joining is done with the help of some delimeter like third thing in btwn (-,*,^,@)

        String s12= "Java".replace("a","o");
        System.out.println(s12); // Jovo

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);

    }




}
