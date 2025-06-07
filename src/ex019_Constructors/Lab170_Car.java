package ex019_Constructors;

public class Lab170_Car {
    public static void main(String[] args) {
        Car tesla =new Car();
        tesla.name = "Tesla Model 3";
        tesla.year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);
        // now model it will access through DC "Car.java" file

        Car nano = new Car();
        nano.name ="Tata Nano";
        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model);
        // here we have only assigned nano name so it will go to DC to check the rest of values

        LoginPage l= new LoginPage(); // read everything from its DC
    }


}
