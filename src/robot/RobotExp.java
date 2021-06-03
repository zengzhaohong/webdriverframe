package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotExp {

	public static void main(String[] args) {
		Robot robot;
		try {
			robot = new Robot();
			
			//定义一定时间的延迟，以便打开需要操作的文件，robot是光标出现在什么位置，执行代码时输入的内容就从什么位置开始
			robot.delay(5000);
			
			robot.keyPress(KeyEvent.VK_Z);
			robot.keyRelease(KeyEvent.VK_Z);
			
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			
			robot.keyPress(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_G);
		} catch (AWTException e) {

		}
		
		

	}

}
