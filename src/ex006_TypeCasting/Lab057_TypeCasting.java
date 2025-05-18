package ex006_TypeCasting;

public class Lab057_TypeCasting {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
       // int total=  course + GST; //narrowing implicit not poss so convert it into explicit
        int total = course + (int)GST;
        System.out.println(total);
// in this .45 paise is lost so ideally we should convert it into float
//always use the bigger container to prevent the data loss

        float total1 = course + GST; // Widening Implicit
      //  float total1 = (float)course + GST; // Explicit but not required
        System.out.println(total1);



    }



}
