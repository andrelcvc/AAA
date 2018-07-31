package com.arquiteto.lab6.web.test;

import java.util.logging.Level;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class VerificaBissexto1WebDriverTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  LoggingPreferences logs = new LoggingPreferences();
	  logs.enable(LogType.BROWSER, Level.ALL);
	  logs.enable(LogType.CLIENT, Level.ALL);
	  logs.enable(LogType.DRIVER, Level.ALL);
	  logs.enable(LogType.PERFORMANCE, Level.ALL);
	  logs.enable(LogType.PROFILER, Level.ALL);
	  logs.enable(LogType.SERVER, Level.ALL);

	  DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
	  desiredCapabilities.setCapability(CapabilityType.LOGGING_PREFS, logs);

	  
	  driver = new FirefoxDriver(desiredCapabilities);
	  
	  //http://chromedriver.chromium.org/downloads
//	  driver = new ChromeDriver(desiredCapabilities);
    
	  
	  baseUrl = "http://localhost:8080/";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testVerificaBissextoWebDriver() throws Exception {
    driver.get(baseUrl + "/lab6/");
    driver.findElement(By.name("ano")).clear();
    driver.findElement(By.name("ano")).sendKeys("2005");
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    try {
      assertEquals("Ano 2005 não é bissexto.", driver.findElement(By.id("resposta")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Voltar")).click();
    driver.findElement(By.name("ano")).clear();
    driver.findElement(By.name("ano")).sendKeys("2000");
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    assertEquals("Ano 2000 não é bissexto.", driver.findElement(By.id("resposta")).getText());
    driver.findElement(By.linkText("Voltar")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
