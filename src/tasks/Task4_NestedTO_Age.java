package tasks;

public class Task4_NestedTO_Age {
    public static void main(String[] args) {
        int age = 80;
        String x = (age > 18) ? (age> 65 ? "Senior" : "Adult") : " Minor";
        System.out.println(x);
    }


}
