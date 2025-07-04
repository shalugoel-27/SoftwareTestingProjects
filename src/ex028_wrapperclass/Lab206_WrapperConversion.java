package ex028_wrapperclass;

public class Lab206_WrapperConversion {
    public static void main(String[] args) {
        String num = "10";
        int aa=10;

        //String -> Wrapper Conversion
        Integer a=Integer.parseInt(num); //parseX()
        //Double.parseDouble() , Float.parseFloat()

        //String to primitive data type
        int a_p= Integer.parseInt(num); //String->WP ; WP-> primitive (Unboxing)

        Integer aa3=Integer.valueOf("10");
        System.out.println(aa3);

        Integer a10 = 66;
        String s = a10.toString();
        System.out.println(a10.toString());// convert int to string
        System.out.println(s instanceof String );

    }
}
