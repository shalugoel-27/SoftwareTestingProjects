package ex025_Super_Abstraction;

public class Lab186 {
    public static void main(String[] args) {
Son s1= new Son();
s1.loan50k(); // abstraction ...hidden that there is one father with the loan

// Father f = new Father(); // u cannot create father obj bcoz an abstract class cannot be instanciated.
    }

}








class Normal{
//concrete class -complete class - although empty
}
abstract class Father{
    abstract void loan50k();
    //incomplete method incomplete class
}
class Son extends Father{
    @Override
    void loan50k(){
        System.out.println("Loan given!");
    }
}

