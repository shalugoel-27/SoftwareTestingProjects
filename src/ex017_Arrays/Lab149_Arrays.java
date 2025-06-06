package ex017_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int[] marks={51,85,70,91,96};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("---for loop-----");

        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }

            System.out.println("-----enhanced for loop----");

            for(int mark : marks){ //mark out of marks
                System.out.println(mark);
            }
        }
    }





