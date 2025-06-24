package ex025_Super_Abstraction;

public class Lab192 {
    public static void main(String[] args) {
        Pramod d =new Dutta(); // dynamic dispatch interface
        Dutta d1 =new Dutta(); // dynamic dispatch interface
        d.display();
        System.out.println(d.a);
    }
}
class Dutta implements Pramod{

    @Override
    public void display() { // complete function
        System.out.println(a);
    }
}
interface Pramod{
    int a=10; //public in nature
    void display(); // abstract ->incomplete
}