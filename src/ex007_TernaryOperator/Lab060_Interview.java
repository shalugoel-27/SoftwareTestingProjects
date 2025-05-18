package ex007_TernaryOperator;

public class Lab060_Interview {
    public static void main(String[] args) {
        // Nested Ternary
        //result = condition 1 ? expression 1 : (condition 2 ? expression 2 : expression 3);

        int age = 25;
        String result = age> 18 ? (age > 25 ? "You can drink" : "You can't drink")  : "You can't go goa";
        System.out.println(result);
    }



}
