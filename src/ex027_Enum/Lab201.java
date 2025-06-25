package ex027_Enum;

public class Lab201 {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocator());
        System.out.println(APIUrls.katalon.getUrl());
    }
}
enum Locators{
    page_button("btn"),
    page_input("#input1");

    private String locator;

    Locators(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}