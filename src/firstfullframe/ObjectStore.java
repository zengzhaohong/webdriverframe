package firstfullframe;

public class ObjectStore {
	
	public static final String LOGIN_LINK="link=登录";
	public static final String LOGIN_USER="xpath=(.//*[normalize-space(text()) and normalize-space(.)='请输入用户名'])[1]/following::input[1]";
	public static final String LOGIN_PWD="xpath=(.//*[normalize-space(text()) and normalize-space(.)='请输入密码'])[1]/following::input[1]";
	public static final String LOGIN_BTN="id=login";
	public static final String HOMEPAGE_USER="xpath=(.//*[normalize-space(text()) and normalize-space(.)='个人'])[1]/following::span[2]";
	public static final String LOGOUT_LINK="xpath=(.//*[normalize-space(text()) and normalize-space(.)='帮助中心'])[1]/following::li[1]";
	public static final String SETTING_PHOTO="id=file";
	public static final String SETTING_COMPANY="name=company";
	public static final String SETTING_SEX="name=sex";
	public static final String SETTING_SEX_MALE="xpath=(.//*[normalize-space(text()) and normalize-space(.)='未付款'])[10]/following::li[1]";
	public static final String SETTING_SEX_FEMALE="xpath=(.//*[normalize-space(text()) and normalize-space(.)='男'])[1]/following::li[1]";
	public static final String SETTING_QQ="name=qq";
	public static final String SETTING_PHONE="name=phone";
	public static final String SETTING_EMAIL="name=email";
	public static final String SETTING_AGE="name=age";
	public static final String PERSONAL_SETTING="xpath=//*[@id=\"app\"]/div[2]/div[1]/div[3]";
	public static final String SETTING_SAVE_BTN="xpath=(.//*[normalize-space(text()) and normalize-space(.)='手机'])[1]/following::button[1]";
   
}
