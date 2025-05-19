package ex007_TernaryOperator;

public class Lab064_AgeClassification {
    public static void main(String[] args) {
        // we r taking i/p from user
// age< 18 = minor , age> 65 = senior else adult

        String user = args[0]; // args[] = this gives only string no mattter if we put int value
        System.out.println(user instanceof String);
        System.out.println(user);
    int age   =Integer.parseInt(user);
       System.out.println(age);

       String result = (age< 18) ? "Minor" : ((age>65) ? "Senior" : "Adult");
        System.out.println(result);
    }




}
