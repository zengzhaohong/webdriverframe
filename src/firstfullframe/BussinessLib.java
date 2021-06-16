package firstfullframe;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class BussinessLib {

	public WebDriver driver;
	
	/**
	 * 对元素的路径进行统一处理，其他类只需调用该方法传入元素的路径
	 * 优点：元素由xpath变为ID或其他时，只需改动元素的路径即可，其他代码不发生变化
	 */
	public static By parseObject(String p_object) {
		String newObject = null;
		if (p_object.startsWith(".//")||p_object.startsWith("//")) {
			return By.xpath(p_object);
		}else if (p_object.startsWith("link=") || p_object.startsWith("Link=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1); //截取=后面所有的字符串
			return By.linkText(newObject);
		} else if (p_object.startsWith("xpath=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.xpath(newObject);
		} else if (p_object.startsWith("id=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.id(newObject);
		} else if (p_object.startsWith("css=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.cssSelector(newObject);
		} else if (p_object.startsWith("class=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.className(newObject);
		} else if (p_object.startsWith("tagName=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.tagName(newObject);
		} else if (p_object.startsWith("name=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1);
			return By.name(newObject);
		} else
		return null;
	}
	
	public void login(WebDriver p_driver,String p_user,String p_pwd){
		driver=p_driver;
		driver.findElement(parseObject(ObjectStore.LOGIN_LINK)).click();
	    driver.findElement(parseObject(ObjectStore.LOGIN_USER)).clear();
	    driver.findElement(parseObject(ObjectStore.LOGIN_USER)).sendKeys(p_user);
	    driver.findElement(parseObject(ObjectStore.LOGIN_PWD)).clear();
	    driver.findElement(parseObject(ObjectStore.LOGIN_PWD)).sendKeys(p_pwd);
	    driver.findElement(parseObject(ObjectStore.LOGIN_BTN)).click();
	   
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean login2(WebDriver p_driver,String p_user,String p_pwd){
		driver=p_driver;
		driver.findElement(parseObject(ObjectStore.LOGIN_LINK)).click();
	    driver.findElement(parseObject(ObjectStore.LOGIN_USER)).clear();
	    driver.findElement(parseObject(ObjectStore.LOGIN_USER)).sendKeys(p_user);
	    driver.findElement(parseObject(ObjectStore.LOGIN_PWD)).clear();
	    driver.findElement(parseObject(ObjectStore.LOGIN_PWD)).sendKeys(p_pwd);
	    driver.findElement(parseObject(ObjectStore.LOGIN_BTN)).click();
	   
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    if (isElementPresent(driver,By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div[3]")))
	    	return true;
	    else 
	    	return false;
	    
	    
	    
	}
	
	
	
	
	    
	  public void settingInfo(WebDriver p_driver,String p_file,String p_age,String p_sex,String p_company,String p_qq,String p_email,String p_phone){
			driver=p_driver;
			driver.findElement(parseObject(ObjectStore.PERSONAL_SETTING)).click();
			driver.findElement(parseObject(ObjectStore.SETTING_AGE)).clear();
			driver.findElement(parseObject(ObjectStore.SETTING_AGE)).sendKeys(p_age);;
            driver.findElement(parseObject(ObjectStore.SETTING_SEX)).click();
           
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            if(p_sex.equals("男"))
               driver.findElement(parseObject(ObjectStore.SETTING_SEX_MALE)).click();
            else
              driver.findElement(parseObject(ObjectStore.SETTING_SEX_FEMALE)).click();
			
			driver.findElement(parseObject(ObjectStore.SETTING_COMPANY)).clear();
			driver.findElement(parseObject(ObjectStore.SETTING_COMPANY)).sendKeys(p_company);
			driver.findElement(parseObject(ObjectStore.SETTING_QQ)).clear();
			driver.findElement(parseObject(ObjectStore.SETTING_QQ)).sendKeys(p_qq);
			driver.findElement(parseObject(ObjectStore.SETTING_EMAIL)).clear();
			driver.findElement(parseObject(ObjectStore.SETTING_EMAIL)).sendKeys(p_email);
			driver.findElement(parseObject(ObjectStore.SETTING_PHONE)).clear();
			driver.findElement(parseObject(ObjectStore.SETTING_PHONE)).sendKeys(p_phone);
			driver.findElement(parseObject(ObjectStore.SETTING_PHOTO)).sendKeys(p_file);	
			driver.findElement(parseObject(ObjectStore.SETTING_SAVE_BTN)).click();
		   
		    try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     	
		
	}
	  
	  public void logout(WebDriver p_driver){
		  driver=p_driver;
		  driver.findElement(parseObject(ObjectStore.HOMEPAGE_USER)).click();
		  driver.findElement(parseObject(ObjectStore.LOGOUT_LINK)).click();  
		  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		}
	  
	  private boolean isElementPresent(WebDriver p_driver,By by) {
		    try {
		      p_driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }
	
}
