package firstfullframe;
import java.util.concurrent.TimeUnit;
import org.junit.*;


import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)//用例按照name顺序执行
public class SettingCasesFinal {
  private static WebDriver driver ;
  private boolean acceptNextAlert = true;
  private static BussinessLib bl;


  @BeforeClass
  public static void setUp() throws Exception {
	driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(AutoTestTool.readProperties("url"));
    bl=new BussinessLib();
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
    driver.quit();
 
  }

  @Test
  public void test1_login() throws Exception {

    bl.login(driver, "liwen629", "Passw0rd");
    assertTrue(isElementPresent(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div[3]")));
    
    //assertTrue(isElementPresent(VPStore.VP_Login));
   
  }
  
  @Test
  public void test2_setting() throws Exception {
	    //driver.findElement(bl.parseObject(ObjectStore.HOMEPAGE_USER)).click(); //非业务方法正常编写
	    bl.settingInfo(driver, "D:\\pic\\1.jpg", "37", "女", "Road","67674297","67674297@qq.com","13888888888");
	    //driver.findElement(arg0)
	    Object expectedList[]={true,"37","女","Road","67674297","67674297@qq.com","13888888888"};
	    Object actualList[]={AutoTestTool.isPicExist("D:\\pic\\vp1.png"),
	    		             driver.findElement(By.name("age")).getAttribute("value"),
	                         driver.findElement(By.name("sex")).getAttribute("value"),
	                         driver.findElement(By.name("company")).getAttribute("value"),
	                         driver.findElement(By.name("qq")).getAttribute("value"),
	    		             driver.findElement(By.name("email")).getAttribute("value"),
	    		             driver.findElement(By.name("phone")).getAttribute("value"),
	    		 };
	    
	    assertArrayEquals(expectedList,actualList);
	  
  }
  
  
  @Test
  public void test3_logout() throws Exception {
	   bl.logout(driver);
	   assertTrue(isElementPresent(By.linkText("登录")));
	  
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
