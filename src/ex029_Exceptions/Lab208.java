package ex029_Exceptions;

public class Lab208 {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        int c=b/a;
        System.out.println(c);
        //unchecked->Arithmetic exceptions , null pointer exception

        String name=null;
        name.trim();
        //nullpointerexception -> cannot invoke null with trim

        //we can handle these exceptions by try and catch and throws method

    }
}
