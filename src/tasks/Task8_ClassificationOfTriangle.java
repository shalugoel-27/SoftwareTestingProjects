package tasks;

public class Task8_ClassificationOfTriangle {
    public static void main(String[] args) {
String n1 = args[0];
String n2 = args[1];
String n3 = args[2];
String result =(n1==n2) ? (n1==n3) ? "equilateral" :"isosceles" : ((n2==n3) ? "isosceles" : "scalene" );
        System.out.println(result);
        // step 1......i/p and o/p data types
        // i/p - int
        // o/p - string
        // step 2 rough logic
        // n1==n2 && n1==n3 - equilateral
        // n1 == n2 && n1 !=n3 or n1 != n2 && n1==n3 or n2 != n3  && n1=n3- isosceles
        //n1 != n2 != n3 - scalene
        //step 3 dry run
    }



}
