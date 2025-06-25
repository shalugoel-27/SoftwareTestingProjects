package ex027_Enum;

public enum APIUrls {
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    APIUrls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
// created an direct enum not a class

