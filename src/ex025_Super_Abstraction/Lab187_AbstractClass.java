package ex025_Super_Abstraction;

public class Lab187_AbstractClass {
    public static void main(String[] args) {
WagonR car =new WagonR();
car.drive(); //this is abstraction ...forgot abt engine nd oll actions just drive
    }
}


















class WagonR extends Engine implements Tyre,Gear{
    void drive(){
        rubberTyre();
        blackcolourDoTyre();
        startEngine();
        changeGear();
        stopEngine();
    }
@Override
    void startEngine(){
    System.out.println("Starting the WagonR");
}

    @Override
    public void rubberTyre() {

    }

    @Override
    public void blackcolourDoTyre() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void changeGear() {

    }
}
abstract class Engine{
    abstract void startEngine();

    void stopEngine(){
        System.out.println("Stop Engine");
    }
}
//abstract class Tyre{
   // u have tyre also along with the engine but when u try to extend it with the engine then problm comes
   // that's why interface comes in pic'
interface Tyre{
    // it contains all incomplete finctions
    void rubberTyre();
    void blackcolourDoTyre();

   // after jdk11 u can have complete functions in interface using keyword default
    default void m2(){

    }
    static void m1(){
        // u can also have static function in interface
    }
}
interface Gear{
    void changeGear();
}
//unlimited default functn are allowed