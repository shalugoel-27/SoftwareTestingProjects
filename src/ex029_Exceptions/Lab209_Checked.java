package ex029_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab209_Checked {
    public static void main(String[] args) {
        //unchecked exception
        int a= 0;
        try {
            a = 10/0; // select this then click on surround to add try nd catch block
        } catch (Exception e) {
            System.out.println(e.getMessage()); // when there is a problm in line 7 i m executed
        }
        System.out.println(a);

//checked exception
        //jvm knows about it -during compilation

        try {
            FileInputStream fileInputStream = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        //jvm knows this that there might be a case that this file is not present so handle it using try and catch
    }
}
