package ex_020_Inheritance.multilevel;

public class Lab175 {
    public static void main(String[] args) {
        Son pramod = new Son();
        //pramod. has access to all
        Father f = new Father();
        //f. has access to grandfather and father
        Grandfather gf =new Grandfather();
        //gf. has access only to grandfathr things

        Son s1 =new Son();
        //Son s2 = new Father(); not possible when father is born u cannot be present
        Father f1= new Son(); // possible this is knwn as dynamic dispatch

       // Grandfather gf= new Father();
        Grandfather gf2 = new Son();
        // this is only possible bcoz of extend keyword that shows relationship

        //Son s = new Grandfather();  not possible

    }
}
