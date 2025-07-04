package ex029_Exceptions;

public class LAb210 {
    public static void main(String[] args) {
        String s1=null;
        try {
            s1.trim();
        } catch (Exception e) { //Exception e= new Exception() ....e is the ref of obj which is auto created by jvm
        e.printStackTrace(); //sout or this anything it will give the details info
        }

    }
}
