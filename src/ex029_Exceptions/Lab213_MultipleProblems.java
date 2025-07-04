package ex029_Exceptions;

public class Lab213_MultipleProblems {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try {
            int c=10/a; //1st problm
            String s1=null;
            s1.trim(); //2nd problm

        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
