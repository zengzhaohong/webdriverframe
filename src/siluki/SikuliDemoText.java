package siluki;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.Image;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemoText {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
		 System.out.println(Image.create("d:\\lesson\\pic\\text.png").text());
		 System.out.println(Image.text("d:\\lesson\\pic\\save.png"));
		 
		
		
		
	}

}
