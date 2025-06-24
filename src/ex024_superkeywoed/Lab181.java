package ex024_superkeywoed;

public class Lab181 {
}
class Baseclass{
    private String browser;

    public Baseclass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAdmin) {
        if(isAdmin){
        this.browser = browser;
    }else{
            System.out.println("Not allowed to change browser not a admin!");
        }


}

void openBrowser(){
    System.out.println("Opening browser");
    }
    void openBrowser(String BrowserName){
        System.out.println("open browser ->" +BrowserName);
    } // method with same name but diff param ...method overloading
    void closeBrowser(){
        System.out.println("Close browser");
    }

}

class TestCase1 extends Baseclass{
    public void tc(){

    }
    public TestCase1(String browser){
        super(browser); // super will call parent constructor
        super.openBrowser();
        super.openBrowser("chrome");
        super.closeBrowser(); //super can access parent's functn

        this.tc(); //this will call my functn

    }

}