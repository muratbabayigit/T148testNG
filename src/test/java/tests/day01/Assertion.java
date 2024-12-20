package tests.day01;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.babayigitPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.ObjectInputFilter;

public class Assertion {
    /*
    https://www.babayigit.net/test sayfasına gidin
    sayfanın title'ının BABAYIGIT.NET içerdiğini doğrulayın
     */

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));
        String actualTitle=Driver.getDriver().getTitle();
        String expectedIcerik="BABAYIGIT.NET";

        // Assert.assertTrue(actualTitle.contains(expectedIcerik));

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actualTitle.contains(expectedIcerik));
        softAssert.assertAll(); //raporlama
        Driver.quitDriver();
    }


     /*
    ÖDEV:
    ,https://www.babayigit.net/test sayfasına gidin
    sayfanın url'inin BABAYIGIT.NET https://www.babayigit.net/test
    adresine eşit olduğunu doğrulayın
     */
}
