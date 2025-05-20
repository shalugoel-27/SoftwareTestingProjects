package tasks;

public class Task7_Dec {
    public static void main(String[] args) {
        int i=1, j=2, k =3;
        int m = i-- - j-- - k--;
        // i-- = 1 and i =0
        // j-- = 2 and j =1
        // k-- = 3 and k=2
        // so m =1 - 2 - 3 = -4
        System.out.println(m);
        System.out.println("i =" +i+ ",j=" +j+ ",k=" +k+ ",m=" +m);
    }


}
