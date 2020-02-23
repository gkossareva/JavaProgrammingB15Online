package day54;

public class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("OPEN THE BROWSER");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("navigate to "+url+ " using Chrome Browser");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing crome browser");
    }
}
