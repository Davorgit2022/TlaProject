package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
      //driver.get( );
    }

    @FindBy(id="php-travels")
        public WebElement php;

    @FindBy(id="mercury-tours")
    public WebElement mercury;

    @FindBy(id="internet")
    public WebElement internet;

    @FindBy(id="e-commerce")
    public WebElement eCommerce;

    @FindBy(id="passion-tea-company")
    public WebElement passionCompany;

    @FindBy(id="sauce-demo")
    public WebElement sauceDemo;

    @FindBy(id="shopping-charts")
    public WebElement shoppingCharts;




}
