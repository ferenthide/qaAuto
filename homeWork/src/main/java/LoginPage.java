import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver= driver;
    }
   //@FindBy
    private By loginImput = By.id("login-form-username");
    private By pswImput = By.id("login-form-password");
    private By signInButton = By.id("login-form-submit");
    private By zagolovok = By.xpath("//div[h1='Добро пожаловать в Jira'");
    private By errorMesage = By.className("//div[@class='aui-message error']//p ");



    public LoginPage typeUserName (String username){
        driver.findElement(loginImput).sendKeys(username);
        return this;
    }
    public LoginPage typePassword (String password){
        driver.findElement(pswImput).sendKeys(password);
        return this;
    }
    public LoginPage clickLogin (){
        driver.findElement(signInButton).click();
        return this;
    }

    public LoginPage loginData (String username, String password){
        this.typeUserName(username);
        this.typePassword(password);
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }
    public String getHeadingText(){
        return driver.findElement(zagolovok).getText();
    }
    public String getErrorText(){
        return driver.findElement(errorMesage).getText();
    }

}
