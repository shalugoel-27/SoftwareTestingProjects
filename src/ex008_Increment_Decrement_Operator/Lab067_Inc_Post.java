package ex008_Increment_Decrement_Operator;

public class Lab067_Inc_Post {
    public static void main(String[] args) {
        int a = 10;
        int b= a++;
        System.out.println(a);
        System.out.println(b);


        // ERT
        // line no  | a  | b
        // 5 | 10 | na
        // 6 | 11 | 10
        // 7 | 11 | na
        //8 | na | 10

        int a_post =20;
        System.out.println(a_post++);
        System.out.println(a_post);
    }




}
