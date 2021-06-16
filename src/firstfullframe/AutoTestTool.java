package firstfullframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class AutoTestTool {
	public static String readProperties(String p_key) {
		
	    
		   String value=null;	 
		   FileInputStream stream=null;
		   String file=System.getProperty("user.dir")+File.separator+"config.properties";
		
		   try {
			   stream = new FileInputStream(file);
		   } catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			   e1.printStackTrace();
		   }
		   
	       Properties prop = new Properties();
	       
	       try {
				prop.load(stream);
				value = prop.getProperty(p_key);  

				stream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	       
	        return value;
	    }
	
	 public static  boolean  isPicExist(String p_iconPath){

	        Pattern pattern = new Pattern(p_iconPath);
	        Screen screen = new Screen();     
	        try {
				screen.find(pattern).getImage();
				return true;
				
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				return false;
			}
	 
	

	    }
	 
	 public static void mySleep(long p_time){
		 
		 try {
			Thread.sleep(p_time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	
}
