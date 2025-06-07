package ex019_Constructors;

public class Lab168_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby(); // 2o bjects r created so it will call 2 times
        new Baby(); // now 3 times
        Baby b2; // this is no a object this is a object refrence
    }

   static class Baby {
        String name;

        Baby() {
            System.out.println("An object is created so i m called");
        }
    }
}