package ex019_Constructors;

public class Lab171_Const {
    public static void main(String[] args) {

        Car2 tesla = new Car2();
        System.out.println(tesla.model); // here it will access the Car2 file.java
        System.out.println(tesla.year);

        Car2 nano = new Car2("nano",2011);
        System.out.println(nano.model);
        System.out.println(nano.year); // here this refers to nano

        Car2 mghector = new Car2("mghector",2025);
        System.out.println(mghector.model);
        System.out.println(mghector.year); // here this refers to mghector
    }




}
