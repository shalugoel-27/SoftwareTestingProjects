package ex010_Switch;

import java.util.Scanner;

public class Lab083_SwitchAutomation {
    public static void main(String[] args) {
        // if user wants to ask which browser should we use for automation
        // CLI or scanner both possible
        //String browser = String(args[]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the browser name");
        String browser = scanner.next();
        browser = browser.toLowerCase(); // this will handle case sensitivity like if user writes Chrome or CHROME
        switch (browser){
            case "chrome" :
                System.out.println("Start the chrome browser");
                System.out.println("Enter the TC1");
                break;
            case "firefox" :
                System.out.println("Start the mozilla firefox");
                break;
            case "edge" :
                System.out.println("Start the edge browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }

    }




}
