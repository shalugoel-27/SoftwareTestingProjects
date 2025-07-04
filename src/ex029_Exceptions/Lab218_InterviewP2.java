package ex029_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab218_InterviewP2 {
    public static void main(String[] args) {
        try {
            FileReader f= new FileReader("C://abc.txt"); //rather than using try nd catch this can be handled using throws keyword
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage() );
        } finally {
        }

    }
}
