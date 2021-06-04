package webdriverframe.com.docker.common;

import org.openqa.selenium.By;

public class BussinessLib {

	public static By parseObject(String p_object) {
		String newObject = null;

		if (p_object.startsWith(".//") || p_object.startsWith("//")) { //����selenium ide xpath��ʶ��
			return By.xpath(p_object);
		} else if (p_object.startsWith("link=") || p_object.startsWith("Link=")) {
			newObject = p_object.substring(p_object.indexOf("=") + 1); //��ȡ=�������е��ַ���
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
}
