package tasks;

public class Task5_Incrmnt {
    public static void main(String[] args) {
        int i = 11;
        i = i++ + ++i;
        System.out.println(i);
    }

// EXP A = i++ ->  i++ = 11 and i =12
    // EXP B = ++i -> 13 and  i =13
    // i = A+B | 11 + 13 = 24

}
