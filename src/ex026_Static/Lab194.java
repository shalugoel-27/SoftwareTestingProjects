package ex026_Static;

public class Lab194 {
    public static void main(String[] args) {
ATB umesh =new ATB(98765,"umesh");
ATB anubha =new ATB(54321,"anubha");
        System.out.println(umesh.phn_no);
        System.out.println(anubha.name);
        System.out.println(ATB.course_name);
        ATB.m1();
    }

}
class ATB{
    int phn_no;
    String name;
    static String course_name ="ATB";

    public ATB(int phn_no, String name){
        this.phn_no= phn_no;
        this.name=name;
    }
void display(){
    System.out.println(this.phn_no + this.name + course_name);
}
static void m1(){
    System.out.println("Mark attendance");
}}
