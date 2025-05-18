package ex005_Operators;

public class Lab045_Interview {
    public static void main(String[] args) {
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b);

        //solve it using divide nd conquer rule
        //A-> balaji_salary > 10 = true
        //B-> balaji_salary < 5 = false
        // !(true||false)
        //!true
    }



}
