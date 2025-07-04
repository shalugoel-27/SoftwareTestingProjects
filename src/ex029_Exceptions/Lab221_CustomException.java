package ex029_Exceptions;

public class Lab221_CustomException {
    public static void main(String[] args) {
        Bank SBI = new Bank(100, "INR");
        Bank ICICI = new Bank(125 , "INR");
        Integer total_bal = SBI.add(ICICI);
        System.out.println(total_bal);
        Bank jp_chase = new Bank(101, "USD");
        Integer total_bal_all_countries = SBI.add(jp_chase);
        System.out.println(total_bal_all_countries);

        //USD is added to INR so there is a problm for which we need to add an exception i.e custom exception
    }
}
