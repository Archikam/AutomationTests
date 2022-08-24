
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;


public class TestFirstSelenium extends BaseTest {

    @Test
    public void testFirstSelenium (){
        getDriver().get("https://netmonet.co/");

        WebElement searchLink = getDriver().findElement(By.cssSelector("#wrapper > div.ng-star-inserted > app-landing-header > div.landing-header > div.menu > div:nth-child(1) > span"));
        searchLink.click();

        WebElement searchButton = getDriver().findElement(By.cssSelector("#benefits > div.l-page-mw.l-scalable.ng-tns-c58-0 > div.benefits.ng-tns-c58-0 > div:nth-child(2) > div.l-btn-join._desktop._secondary.d-only.ng-tns-c58-0 > a"));
        Assert.assertEquals(searchButton.getText(),"Посмотреть демо-страницу");
    }
}
