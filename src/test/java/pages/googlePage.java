package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class googlePage {
    public googlePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='gLFyf']")
    public WebElement searchBox;

    @FindBy(id="hdtb-tls")
    public WebElement araclar;

    @FindBy (id="result-stats")
    public WebElement result;

    @FindBy(xpath = "(//*[@class='gNO89b'])[2]")
    public WebElement searchButton;
}
