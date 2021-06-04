package webdriverframe.com.docker.setting;

import webdriverframe.com.docker.common.CommonOB;

/*
 * 存放着与docker系统中设置模块相关的element对象
 */
public class SettingOB extends CommonOB{
	
	public static String SettingTab = "/html/body/div[1]/div[2]/div[1]/div[3]";
	public static String AgeText = "age";
	public static String SexText = "sex";
	
	public static String Male = "//div[2]/div/div/ul/li[1]";
	public static String Female = "//div[2]/div/div/ul/li[2]";
	
	public static String CompanyText = "name=company";
	public static String QQText = "name=qq";
	public static String EmailText = "name=email";
	public static String PhoneText = "name=phone";
	
	public static String SaveButton = "xpath=(//button[@type='button'])[27]";

}
