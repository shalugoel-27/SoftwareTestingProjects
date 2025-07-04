package ex028_wrapperclass;

public class Lab205 {
    public static void main(String[] args) {
        int a=10;
        Integer b=a; //boxing int ->Integer = Autoboxing done by the JVM
        System.out.println(a); // u cannot access a.
        System.out.println(b.intValue()); //advantage u can access n no of functns using b.

        //Unboxing
        Integer aa=55;
        int a1=aa;
        System.out.println(a1);// u loose attributes nd behaviour
        System.out.println(aa); // acess aa.

        //earlier we use to write
        Integer num= new Integer(10); //but this is to much too write
        //so wrapper class
        Integer n =10; //autoboxing

        Integer my_int=10;
        String value= my_int.toString(); // int to string
        //now string to int
        int p_int =my_int; //unboxing
        int p_int2 = my_int.intValue(); //u can use anyway
    }
}
