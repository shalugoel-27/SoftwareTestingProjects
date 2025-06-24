package ex025_Super_Abstraction;

public class Lab188_Interface {
    public static void main(String[] args) {
        Car1 car1 =new Car1();
        car1.drive();

    }
}
class Car1 implements Engine1,Brakes{
    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stoping the engine");
    }
}
interface Brakes{
    void applyBreak();
}
interface Engine1{
    void startEngine();
    void stopEngine();
    default void testEngine(){
        System.out.println("Concrete complete");
    }
}