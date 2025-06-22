package ex021_poly.overriding;

public class Pramod extends Father{
    void p1(){
        System.out.println("Pramod-p1");
    }
    @Override // this is not mandatory to write as it is auto understood by JVM but it is good practicce to write
    // it means my father also has the home i have overriden this
    void home(){
        System.out.println("Pramod-3bhk");
    }
}
