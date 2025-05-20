package tasks;

public class Task6_Inc {
    public static void main(String[] args) {
        int a = 11, b=22, c;
        c= a + b + a++ + b++ + ++a + ++b;
        System.out.println("a=" +a); //13
        System.out.println("b=" +b); // 24
        System.out.println("c=" +c); // 103
    }

// line no 6
    //a = 11 , b =22
    //a++ =11 and a=12
    //b++ =22 and b=23
    //++a =13 and a= 13
    //++b = 24  and b =24

}
