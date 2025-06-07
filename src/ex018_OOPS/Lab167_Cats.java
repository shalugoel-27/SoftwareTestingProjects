package ex018_OOPS;

public class Lab167_Cats {
    public static void main(String[] args) {
Cat c1 = new Cat(); // 1 object is created
        Cat c2 = null; // no object created
        new Cat(); // this is a object without refrence

        c1.running();
        c2.running(); // null pointer exception c2 is pointing to null & null does not have access to attributes or behaviour
    }

    static class Cat {
        String name;

        void running() {
            System.out.println("Running");

        }
    }
}
