package tests.day01;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.googlePage;
import utilities.ConfigReader;
import utilities.Driver;

public class FilmArama {
    /*
            https://www.google.com.tr sayafısna gidin
                "12 kızgın adam"
                "er ryan'ı kurtarmak"
                "vizontele"

            filmlerini aratarak arama sonuç sayılarını yazıdırınız

     */

    @Test
    public void filmArama01(){
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        googlePage obj=new googlePage();
        obj.searchBox.sendKeys("12 kızgın adam"+ Keys.ENTER);
        obj.araclar.click();
        System.out.println("\n\"12 kızgın adam\" arama sonuç sayısı: "+obj.result.getText());
        Driver.quitDriver();

    }

    @Test
    public void filmArama02(){
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        googlePage obj=new googlePage();
        obj.searchBox.sendKeys("er ryan'ı kurtarmak"+Keys.TAB);
        obj.searchButton.click();
        obj.araclar.click();
        System.out.println("\n\"er ryan'ı kurtarmak\" arama sonuç sayısı: "+obj.result.getText());
        Driver.quitDriver();

    }

    @Test
    public void filmArama03(){
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        googlePage obj=new googlePage();
        obj.searchBox.sendKeys("vizontele"+Keys.TAB);
        obj.searchButton.click();
        obj.araclar.click();
        System.out.println("\n\"vizontele\" arama sonuç sayısı: "+obj.result.getText());
        Driver.quitDriver();

    }
}
