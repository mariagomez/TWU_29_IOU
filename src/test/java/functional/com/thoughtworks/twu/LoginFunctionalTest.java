package functional.com.thoughtworks.twu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class LoginFunctionalTest {

    private WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = new HtmlUnitDriver();
    }

    @Test
    public void shouldShowTheEmailInputBox() {
        webDriver.get("http://localhost:9130/twu/login");
        List<WebElement> emailItems = webDriver.findElements(By.name("email"));
        assertEquals(1, emailItems.size());
    }

    @Test
    public void shouldShowThePasswordInputBox() {
        webDriver.get("http://localhost:9130/twu/login");
        List<WebElement> passwordItems = webDriver.findElements(By.name("password"));
        assertEquals(1, passwordItems.size());
    }

    //Have temporarily changed to dashboard instead of Credential checker
    @Test
    public void shouldSendToDashBoardOnGoodCredentialsCheckerUponSubmit() {
        webDriver.get("http://localhost:9130/twu/login");

        webDriver.findElement(By.name("email")).sendKeys("BlahBlah@gmail.com");
        webDriver.findElement(By.name("password")).sendKeys("password");

        webDriver.findElement(By.id("loginForm")).submit();

        assertThat(webDriver.getCurrentUrl(), is("http://localhost:9130/twu/dashboard"));


    }


    @After
    public void tearDown() {
        webDriver.close();
    }


}

