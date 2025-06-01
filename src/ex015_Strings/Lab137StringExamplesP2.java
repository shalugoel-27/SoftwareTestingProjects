package ex015_Strings;

public class Lab137StringExamplesP2 {
    public static void main(String[] args) {
        CharSequence c = "Java".subSequence(1,3);
        System.out.println(c); // av -end pt is not printed

        CharSequence d = "Java".subSequence(1,1);
        System.out.println(d);

        CharSequence e = "Pramod".subSequence(1,4);
        System.out.println(e); //ram


    }




}
