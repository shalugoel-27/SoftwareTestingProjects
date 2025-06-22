package ex021_poly.overriding;

public class RealExample {
    public static void main(String[] args) {
        TC_Chrome t = new TC_Chrome();
        t.openBrowser(); //at run time it will decide which funct i should call
    }
}
class CommonToAllTc{
    void openBrowser(){
        System.out.println("open the browser");
    }

}
class TC_Chrome extends CommonToAllTc{
    //@Override
    void openBrowser(){
        System.out.println("Starting the chrome");
        //new Chromedriver(); //trying to write bettr version of above openbrowser by adding some code that's why overriden
    }
}