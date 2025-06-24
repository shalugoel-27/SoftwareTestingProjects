package ex023_AccessModifiers.criminal;

import ex023_AccessModifiers.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(10);
       // thief.canIShoot();
       // System.out.println(thief.gun);
        //here thief can access the gun and shoot so make it private
        //but if i make it private so another Jr.Cop will also not have access to gun and sshoot so we use a keyword protected

    }
}
