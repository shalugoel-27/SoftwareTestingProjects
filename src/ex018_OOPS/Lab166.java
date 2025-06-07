package ex018_OOPS;

public class Lab166 {
    public static void main(String[] args) {
        Student s1 = new Student ();
        // Student -class loading
        //s1 - OR object refrence
        // new Student() - object creation
    }





}
class Student{ // this class cannot be - public class student bcoz u cannot have 2 public classes
    String name;
    int roll_no;

    void sleep(){}; // if u create this class outside then this is reusable but if u create it here inside it is not much useful
}