package ex007_TernaryOperator;

public class TO_Practice {
    public static void main(String[] args) {
        int a= 100, b=20 , c= 300, d= 40;
        String max = (a>b && a>c && a>d) ? "a" : (b>c && b>d) ? "b" : (c>d ? "c" : "d");
        System.out.println(max);
    }



}
