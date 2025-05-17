package ex005_Operators;

public class Lab040_IntConcat {
    public static void main(String[] args) {
        String first_name = "Sha lu";
        String last_name = " Goel";

        int a= 10;
        int b =20;

        System.out.println(first_name + last_name + a + b);
        System.out.println(a + b + first_name + last_name);
        System.out.println(first_name + last_name + (a+b)); // follows Bodmas
    }





}
