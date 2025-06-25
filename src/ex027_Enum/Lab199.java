package ex027_Enum;

public class Lab199 {
    public static void main(String[] args) {
        System.out.println(URLs.katalon);
        if (URLs.katalon.equals("katalon")){
            System.out.println("I want to do something");
        }
    }
}
//enum is nothing
enum URLs{
    google,restassured,katalon,vwo
}