package pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class babayigitPage {

    public babayigitPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id="search")
    public WebElement searchBox;
}
