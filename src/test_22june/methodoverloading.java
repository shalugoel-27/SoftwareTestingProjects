package test_22june;

public class methodoverloading {
    public static void main(String[] args) {
        MathOperations m =new MathOperations();
       int s= m.add(5,3);
        System.out.println(s);
       int s1= m.add(1,2,3);
        System.out.println(s1);
        double s2 = m.add(2.5,3.7);
        System.out.println(s2);
    }
}
