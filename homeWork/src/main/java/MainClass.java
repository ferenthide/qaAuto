import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\S\\IdeaProjects\\homeWork\\src\\main\\driver\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://jira.ics.gov.ua/login.jsp");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          LoginPage loginPage = new LoginPage(driver);
          loginPage.loginData("zhatikov","apcJAj6JaU");
        FindTasks findTasks = new FindTasks(driver);
        findTasks.findMyIssuesInJira();
//
//        loginPage.typeUserName("zhatikov");
//        loginPage.typePassword("apcJAj6JaU");
//        loginPage.clickLogin();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        findTasks.findMyIssuesInJira();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        WebElement issues = driver.findElement(By.xpath("//div[@class = 'aui-header-inner']//a[@id='find_link'])"));
//        driver.findElement(By.xpath("//div[@class = 'aui-header-inner']//a[@id='find_link'])")).click();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(issues);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



    }


}
