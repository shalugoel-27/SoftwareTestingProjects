package ex029_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LAb219 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f= new FileReader("C://abc.txt");
    }
}
//handled the exception using keyword throws