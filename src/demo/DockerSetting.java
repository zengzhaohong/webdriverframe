package demo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
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
import org.openqa.selenium.interactions.Actions;

import objectstore.LoginObjectStore;
import objectstore.SettingObjectStore;

public class DockerSetting {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
	ReadFileDemo readFileDemo = new ReadFileDemo();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
//	    baseUrl = "https://www.google.com/";
	    baseUrl = readFileDemo.readProperties("url");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testSetting() throws Exception {
//	    driver.get("http://www.doclever.cn/controller/index/index.html");
		driver.get(baseUrl);
	    driver.findElement(By.linkText(LoginObjectStore.LoginText)).click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath(LoginObjectStore.UserNameText)).clear();
	    driver.findElement(By.xpath(LoginObjectStore.UserNameText)).sendKeys("zengzhaohong");
	    driver.findElement(By.xpath(LoginObjectStore.PasswordText)).clear();
	    driver.findElement(By.xpath(LoginObjectStore.PasswordText)).sendKeys("123456");
	    driver.findElement(By.xpath(LoginObjectStore.LoginButton)).click();
	    //断言是不是包含文本
	    assertTrue(isElementPresent(By.xpath(".//*[contains(text(),'zengzhaohong')]")));
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(SettingObjectStore.SettingTab)).click();
	    
	    
	    driver.findElement(By.name(SettingObjectStore.AgeText)).clear();
	    driver.findElement(By.name(SettingObjectStore.AgeText)).sendKeys("22");
	    
	    driver.findElement(By.name(SettingObjectStore.SexText)).click();
	    driver.findElement(By.xpath(SettingObjectStore.Male)).click();

	    driver.findElement(By.name(SettingObjectStore.CompanyText)).clear();
	    driver.findElement(By.name(SettingObjectStore.CompanyText)).sendKeys("12345");
	   
	    driver.findElement(By.name(SettingObjectStore.QQText)).clear();
	    driver.findElement(By.name(SettingObjectStore.QQText)).sendKeys("12345678");
	    
	    driver.findElement(By.name(SettingObjectStore.EmailText)).clear();
	    driver.findElement(By.name(SettingObjectStore.EmailText)).sendKeys("111582@qq.com");
	    
	    driver.findElement(By.name(SettingObjectStore.PhoneText)).clear();
	    driver.findElement(By.name(SettingObjectStore.PhoneText)).sendKeys("135456789188");
	    driver.findElement(By.xpath(SettingObjectStore.SaveButton)).click();
	    
	    //多点断言可以使用数组的方式
	    String expectedList[] = {"24","男","12345","12345678","1115827740@qq.com","13223456789"};
	    String actualList[] = {driver.findElement(By.name(SettingObjectStore.AgeText)).getAttribute("value"),
	    					  driver.findElement(By.name(SettingObjectStore.SexText)).getAttribute("value"),
	    					  driver.findElement(By.name(SettingObjectStore.CompanyText)).getAttribute("value"),
	    					  driver.findElement(By.name(SettingObjectStore.QQText)).getAttribute("value"),
	    					  driver.findElement(By.name(SettingObjectStore.EmailText)).getAttribute("value"),
	    					  driver.findElement(By.name(SettingObjectStore.PhoneText)).getAttribute("value"),
	    		};
	    assertArrayEquals(expectedList, actualList);
//	    Actions actions = new Actions(driver);
//	    actions.moveToElement(driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div/div[3]/div/span/span"))).perform();
	    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div/div[3]/div/span/span")).click();
	    Thread.sleep(3000);
/*id='dropdown-menu-1438后面的数字一直在变动中，不能将其写死，需要使用xpath中的函数
 *driver.findElement(By.xpath("//ul[@id='dropdown-menu-1438']/li[2]")).click();
*/
	    driver.findElement(By.xpath("//ul[starts-with(@id,'dropdown-menu-')]/li[2]")).click();
	    assertTrue(isElementPresent(By.linkText("登录")));
	  
	  }

	 
	  
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
/*经典的二次封装，判断元素是否存在，如果存在返回true，如果不存在返回false，
 *通常都是结合assertTure 
 *封装是为了如果元素不存在，代码可以正常跑，不影响其他代码
*/
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
