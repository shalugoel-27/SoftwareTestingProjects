package ex021_poly.overloading;

public class Lab177_Moverloading {
    public static void main(String[] args) {
        MathOperations m1= new MathOperations(); // object is created and class is loaded
       int r= m1.add(3,5);
        System.out.println(r);
       int r1= m1.add(2,5,9);
        System.out.println(r1);
        //now based on the parameters at the compile time jvm will decide which function i should call in MathOperations
       // m1.add(25,33,65,55); // it does not match with any funct so compile time errror comes
       double r2=  m1.add(36.25,44.01);
        System.out.println(r2);

        //here m1 behaves differently with each and every funct so it is an example of polymorphism
//u can use debug opt & step into btn to check which funct is called

    }



}
