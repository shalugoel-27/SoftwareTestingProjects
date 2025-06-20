package ex_020_Inheritance;

public class LAb172 {
    public static void main(String[] args) {

        Son pramod = new Son();
        System.out.println(pramod.gold);
        pramod.bhk2();
        pramod.bhk3(); // extends means son has access to each and everything of father also

        Cousin c= new Cousin();
        c.bhk3();
       // c.gold;// no cousin cannot access gold bcoz he is not extending from father



    }
}
