package ex021_poly.overriding;

public class Lab178 {
    public static void main(String[] args) {
        Pramod p =new Pramod();
        p.home();// home is avail in pramod as wellas father so it will call whose obj is created - 3bhk
        p.p1();

        Father f= new Father();
        f.home(); // here it will call fathers home -2bhk
        f.f1();

        Father f2 =new Pramod(); // dynamic dispatch possible
        f2.home(); // it will call the funct whose object is created -3bhk
    }
}
