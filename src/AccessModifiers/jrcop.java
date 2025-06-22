package AccessModifiers;

public class jrcop {
    public static void main(String[] args) {
        Cop JrCop = new Cop(10);
        JrCop.canIShoot(); // bcoz of protected we can use it in the same pkg
    }
}