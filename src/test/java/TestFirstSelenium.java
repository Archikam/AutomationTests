
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;


public class TestFirstSelenium extends BaseTest {

    @Test
    public void testFirstSelenium (){
        getDriver().get("https://netmonet.co/");

        WebElement searchLink = getDriver().findElement(By.cssSelector(
                "#wrapper > div.ng-star-inserted > app-landing-header > div.landing-header > div.menu > div:nth-child(1) > span"));
        searchLink.click();

        WebElement searchButton = getDriver().findElement(By.cssSelector(
                "#benefits > div.l-page-mw.l-scalable.ng-tns-c58-0 > div.benefits.ng-tns-c58-0 > div:nth-child(2) > div.l-btn-join._desktop._secondary.d-only.ng-tns-c58-0 > a"));
        Assert.assertEquals(searchButton.getText(),"Посмотреть демо-страницу");
    }
    @Test
    public void testSecondSelenium () throws InterruptedException {
        getDriver().get("https://netmonet.co/");
        WebElement searchButtonConnect = getDriver().findElement(By.cssSelector(
                "#finish > div.l-page-mw.l-scalable > div.l-finish__content.ng-star-inserted > div.tiles-section-right > div:nth-child(1) > div.zero-fee > a"));

        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].scrollIntoView(false)", searchButtonConnect);
        searchButtonConnect.click();

        WebElement textCheck = getDriver().findElement(By.cssSelector(
                "body > app-root > app-partnership > div > div.ntmnt-ps-prebody.margin-top-8 > div:nth-child(1) > div > div"));
        Assert.assertEquals(textCheck.getText(), "Заполните форму ниже, чтобы подключить заведение к нашей Платформе безналичных чаевых");
    }
}
