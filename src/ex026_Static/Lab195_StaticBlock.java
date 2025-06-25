package ex026_Static;

public class Lab195_StaticBlock {
    public static void main(String[] args) {
A a = new A();
    }
}
class A{
    static{
        System.out.println("Called only once when class is loaded");
        System.out.println("You can write a code reading a excel file,database file");
    }
    static int a=10;

    static void m1(){
        System.out.println("static funct");
    }
}
