import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
ЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕ

import javax.swing.*;

public class FindTasks {
    private WebDriver driver;
    public FindTasks (WebDriver driver){
        this.driver = driver;
    }
    private By task = By.xpath("//div[@class='aui-header-primary']/ul/li[3]']");
    private By link = By.xpath("//div[@class='intro']//a");


    public void findMyIssuesInJira (){
        driver.findElement(task).click();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(task)
//                .build()
//                .perform();
    }



}
