package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url=readProperties("url");
		System.out.println(url);

	}
	
	public static String readProperties(String p_key) {
		   String value=null; 
		   FileInputStream stream=null;
		   //user.dir当前项目的路径，file.separator文件分割符号，不同的系统有不同的文件分割符
		   String file=System.getProperty("user.dir")+File.separator+"config.properties";
		   System.out.println(file);
		  
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

}