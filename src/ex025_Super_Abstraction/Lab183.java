package ex025_Super_Abstraction;

public class Lab183 {
    public static void main(String[] args) {
        Car c1= new Car(100);
        c1.Display();
    }
}
class Vehicle{
    public int maxspeed= 180;

    void noTest(){
        System.out.println("Empty!");
    }
    Vehicle(){
        System.out.println("Default Const"); //only one DC possible
    }
    Vehicle(int a){
        System.out.println("Param Const");
    }
    Vehicle(int a, int b){
        System.out.println("Param Const"); // more than one Param Const possible
}
//Method overloading - same name funct with diff arguments

void message(){
    System.out.println("No return no argument");
    }
    void message(int a){
        System.out.println("PC-argument");
    }
    void Display(){
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle{
    private int maxSpeed= 281;

    Car(){
        super(100);

    }
    void test(){}

    Car(int a){
        System.out.println("PC-Car");
    }
    @Override
    void Display(){
        System.out.println("Override of Car");
        System.out.println(super.maxspeed); //parent ki 180
        System.out.println(this.maxspeed); //khud ki 281
        super.noTest();
        this.test();

    }
}