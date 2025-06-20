package ex019_Constructors;

public class Car2 {
    String model;
    int year;

    // constructor overloading
    Car2() {
        model = "XXX";
        year = 1990;
        System.out.println("DC"); // default const is only 1 it cannot be 2 but parametrized can be multiple
    }

    Car2(String model_name, int year_created) {
        this.model = model_name; //this keyword is hidden created by java guyz if u dont use it still it is added here bydefault
        this.year = year_created; // this means Car2
    }

    Car2(String model_name) {
        this.model = model_name;
    }
}




