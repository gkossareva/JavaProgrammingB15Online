package day54;

public class Automation {
    public static void main(String[] args) {
        WebDriver c1=new ChromeDriver();//refering your sub type with the super type POLYMORPHISM
        c1.openBrowser();
        c1.navigateTo("www.cybertek.com");
        c1.maximize();
        c1.closeBrowser();
    }
}
