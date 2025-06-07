package ex018_OOPS;

public class LabTask {
String name;
// here, when class is loaded null will be assigned to this but we want to assign some default value to this
    // so when ever a new object is created in the MainLAbTask a method with the same name as class LAbTask will be automatically called

    LabTask(){
        System.out.println("DC- Default constructor is called");
    } // it has no return type no void nothing it will be automatically called inside the MAinLabTask

void printname(){
    System.out.println("Hi ,name");
}



}
