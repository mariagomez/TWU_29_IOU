package functional.com.thoughtworks.twu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.internal.matchers.StringContains.containsString;

public class BillFunctionalTest {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = new HtmlUnitDriver();
        webDriver.get("http://localhost:9130/twu/login");

        webDriver.findElement(By.id("email")).sendKeys("sajacobs@thoughtworks.com");
        webDriver.findElement(By.id("password")).sendKeys("1234");

        webDriver.findElement(By.id("loginForm")).submit();

    }

    @Test
    public void shouldRedirectToDashBoardOnSaveClick() {
        webDriver.get("http://localhost:9130/twu/add-bill");
        WebElement link = webDriver.findElement(By.tagName("a"));
        assertThat(link.getAttribute("href"), is("http://localhost:9130/twu/dashboard"));

    }

    @After
    public void tearDown() {
        webDriver.close();
    }

}

