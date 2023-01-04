package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//button[contains(@class, \"_42ft _4jy0 _9xo6 _4jy3 _4jy1 selected _51sy\")]";
    public static final String XPATH_REGISTER = "//button[contains(@class, \"_6j mvm _6wk _6wl _58mi _6o _6v\")]";
    public static final String XPATH_CREATE_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_FIRSTNAME = "//input[contains(@class, \"inputtext _58mg _5dba _2ph-\") and contains(@name, \"firstname\")]";
    public static final String XPATH_LASTNAME = "//input[contains(@class, \"inputtext _58mg _5dba _2ph-\") and contains(@name, \"lastname\")]";
    public static final String XPATH_MAIL = "//input[contains(@class, \"inputtext _58mg _5dba _2ph-\") and contains(@name, \"reg_email__\")]";
    public static final String XPATH_MAIL_AGAIN = "//input[contains(@class, \"inputtext _58mg _5dba _2ph-\") and contains(@name, \"reg_email_confirmation__\")]";
    public static final String XPATH_PASSWORD = "//input[contains(@class, \"inputtext _58mg _5dba _2ph-\") and contains(@name, \"reg_passwd__\")]";
    public static final String XPATH_DAY = "//select[contains(@class, \"_9407 _5dba _9hk6 _8esg\") and contains(@name, \"birthday_day\")]";
    public static final String XPATH_MONTH = "//select[contains(@class, \"_9407 _5dba _9hk6 _8esg\") and contains(@name, \"birthday_month\")]";
    public static final String XPATH_YEAR = "//select[contains(@class, \"_9407 _5dba _9hk6 _8esg\") and contains(@name, \"birthday_year\")]";
    public static final String XPATH_SEX = "//input[contains(@class, \"_8esa\") and contains(@name, \"sex\") and @value = \"2\"]";
    public static final String XPATH_WAIT = "//div[contains(@class, \"large_form\")]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME, Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_WAIT)));

        WebElement firstname = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstname.sendKeys("Tester");

        WebElement lastName = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastName.sendKeys("Testerski");

        WebElement mail = driver.findElement(By.xpath(XPATH_MAIL));
        mail.sendKeys("tester@gmail.com");

        WebElement mailAgain = driver.findElement(By.xpath(XPATH_MAIL_AGAIN));
        mailAgain.sendKeys("tester@gmail.com");

        WebElement password = driver.findElement(By.xpath(XPATH_PASSWORD));
        password.sendKeys("tester123!");

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(21);

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(5);

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1990");

        driver.findElement(By.xpath(XPATH_SEX)).click();
        driver.findElement(By.xpath(XPATH_REGISTER)).click();
    }
}
