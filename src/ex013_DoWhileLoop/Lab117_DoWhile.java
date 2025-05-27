package ex013_DoWhileLoop;

public class Lab117_DoWhile {
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println("This is body, I will definately execute one time");
            System.out.println(a);
            a++;
        } while (a < 10);


        int b = 1;
        do {
            System.out.println(" Body!");
            System.out.println(b);
            b++;
        } while (b > 10); //condition is false still one time it is executed
    }
}