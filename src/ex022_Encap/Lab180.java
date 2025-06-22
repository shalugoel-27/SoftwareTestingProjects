package ex022_Encap;

public class Lab180 {
    public static void main(String[] args) {
        ICICBank amit = new ICICBank("Amit",100,"ICICI");
        System.out.println(amit.getBal());

      //  boolean isCashier = false; // not allowed not a cashier
        boolean isCashier = true; // bal is set to 1000
        amit.setBal(1000,isCashier);
        System.out.println(amit.getBal());
        System.out.println(amit.bank_name);
    }
}
class ICICBank{
   private String name;
   private long bal;
    public String bank_name= "ICICI";

    public ICICBank(String name, long bal, String bank_name) {
        this.name = name;
        this.bal = bal;
        this.bank_name = bank_name;
    }
// first we have created parametrized constructor
    // second we can access private things using gettr setter
    //third add the validation in setbal

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed- not a cashier");
        }
    }
}
