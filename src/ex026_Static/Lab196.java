package ex026_Static;

public class Lab196 {
    public static void main(String[] args) {

    }
}
class ATB1{
    {
        System.out.println("IIb- this is called when object is created");
        //what s the purpose?
        //here u can write code related to
        //start a website or anything before starting the
        //web automation or api automation
    }
    static{
        System.out.println("Whenenver u load the class i ll execute");
    }

    private String name; // non static
    private String phone;
    static String course_name ="ATB12x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   void readDocuments(){
       System.out.println("Non static");
       System.out.println(course_name); // read document is diff for everyone so non static

    }
    static void doAssignment(){ // do assignment is same for eyeryone so static
       // System.out.println(phone); // static method can't access the non static var
        System.out.println("do Assignment");
    }
}