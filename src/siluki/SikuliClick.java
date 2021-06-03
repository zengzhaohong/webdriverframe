package siluki;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class SikuliClick {


	        public static void main(String[] args) throws InterruptedException {
	                Screen s = new Screen();
	                try{
	                        //s.click("d:\\lesson\\pic\\save.png");
	                        s.wait("d:\\lesson\\pic\\chrome.png");
	                        //s.click();
	                        //s.write("shenyang");
	                        //s.type("shenyang"+Key.ENTER);
	                       // s.keyDown(Key.ENTER);
	                        //s.keyUp(Key.ENTER);
	                }
	                catch(FindFailed e){
	                        e.printStackTrace();
	                }
	        }

	}

