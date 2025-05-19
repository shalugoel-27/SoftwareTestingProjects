package ex007_TernaryOperator;

public class Lab063_ThreeMAx {
    public static void main(String[] args) {
//        // Logic building formula
//        step 1 - input and output
//                i/p -> int
//                o/p -> int=max no or string = this is a max no
//        step 2 - rough logic
//            n1> n2 && n1> n3 -> n1
//                    n2> n3 && n2> n1 -> n2
//                            else n3
        //step 3- dry run
int n1= 18, n2 =-9, n3 =16;
        int max = (n1> n2) ? (n1>n3) ? n1 : n3 : ((n2>n3) ? n2 :n3);
     //   String max = (n1> n2) ? (n1>n3) ? "n1" : "n3" : ((n2>n3) ? "n2" :"n3");

        System.out.println(max);



    }





}
