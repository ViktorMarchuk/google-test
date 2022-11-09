package by.org.google_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing{
    @Test
    public void testGoogleButton(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        String url = "https://www.google.by/";
        driver.get(url);

        String xPathInput = "//input[@class='gLFyf gsfi']";
        By byPageInput = By.xpath(xPathInput);
        WebElement webElementPageInput = driver.findElement(byPageInput);
        String name = "Selenium";
        webElementPageInput.sendKeys(name);

        String xPathClick = "//div[@class='FPdoLc lJ9FBc']/center/input[1]";
        By byPageClick = By.xpath(xPathClick);
        WebElement webElementPageClick = driver.findElement(byPageClick);
        webElementPageClick.click();

        String xPathClick01 = "//a[@href='https://www.selenium.dev/']/h3";
        By byPageClick01 = By.xpath(xPathClick01);
        WebElement webElementPageClick01 = driver.findElement(byPageClick01);
        webElementPageClick01.click();

    }
}