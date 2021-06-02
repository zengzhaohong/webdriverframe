package demo;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DockerSetting {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testSetting() throws Exception {
	    driver.get("http://www.doclever.cn/controller/index/index.html");
	    driver.findElement(By.linkText("µÇÂ¼")).click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//input[@type='text']")).clear();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("zengzhaohong");
	    driver.findElement(By.xpath("//input[@type='password']")).clear();
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	    driver.findElement(By.xpath("//button[@id='login']/span")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]")).click();
	    
	    driver.findElement(By.name("age")).clear();
	    driver.findElement(By.name("age")).sendKeys("22");
//	    driver.findElement(By.xpath("//input[@name='age']")).clear();
//	    driver.findElement(By.xpath("//input[@name='age']")).sendKeys("23");
	    
	    driver.findElement(By.name("sex")).click();
	    driver.findElement(By.xpath("//div[2]/div/div/ul/li[2]")).click();

	    driver.findElement(By.name("company")).clear();
	    driver.findElement(By.name("company")).sendKeys("12345");
	   
	    driver.findElement(By.name("qq")).clear();
	    driver.findElement(By.name("qq")).sendKeys("12345678");
	    
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("111582@qq.com");
	    
	    driver.findElement(By.name("phone")).clear();
	    driver.findElement(By.name("phone")).sendKeys("135456789188");
	    driver.findElement(By.xpath("(//button[@type='button'])[27]")).click();
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
