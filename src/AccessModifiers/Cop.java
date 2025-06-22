package AccessModifiers;

public class Cop {
    private int gun;
    String icard;

    public Cop(int gun) {// public is optional here
        this.gun = gun;
    }
    protected void canIShoot(){
        System.out.println("yes Cops can shoot");
        // by using protected keyword u can shoot in this pkg means it is available to cop and JrCop also
    }

    void defaultFunction(){

    }
}
