package ex014_Functions;

public class Lab122_SimpleFunction {
    public static void main(String[] args) {
        //There r 2 type of function
        //1. that will return something
        //2. that will not return anything like void

        non_return_type_Funct(); //it will not return anything only printing

        int a= return_type_Funct();
        System.out.println(a); //a=10
    }

static void non_return_type_Funct(){
    System.out.println("Non-return type");
}
static int return_type_Funct(){
    System.out.println("Return type");
    return 10; //it can return int or string
}
static String return_type(){
    return shalu;
}
static float return_type(){
    return 3.14f;
}
static long return_type(){
    return = 10l;
}
static byte return_type(){
        return 100;
}
static boolean return_type(){
        return true; //if we dont return we get error ....either return it or make it void
}

}
