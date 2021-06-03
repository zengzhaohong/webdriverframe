package siluki;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPicExist2("d:\\lesson\\pic\\image8.jpg"));
			
	}
	
	 public static  boolean  isPicExist2(String p_iconPath){

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
	 
	 public static  boolean  isPicExist(String p_iconPath){

	       
	        Screen screen = new Screen();     
	        try {
	        	screen.wait(p_iconPath);
				return true;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return false;
			}
	 }
	  

}
