package ex019_Constructors;

public class Lab169_oopsConst {
    public static void main(String[] args) {


        A a1 = new A();
        System.out.println(a1);
//a1 does not store it just point to the object

    }


}
class A{
    A(){
        System.out.println("Read a CSV file");
        System.out.println("Open the page before loading the scripts");
        System.out.println("u can do anything u want to do when an obj is created");
    }
}