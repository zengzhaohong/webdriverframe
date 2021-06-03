package robot;

import java.awt.AWTException;

import robot.RobotKeyboard;

public class RobotTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			//使用robot时，输入法必须是英文，robot类使用的路径等字符串必须是英文路径
			RobotKeyboard.getInstance().typeString("G:\\pic\\tx.png");
			RobotKeyboard.getInstance().typeKey("Tab", 2);
			RobotKeyboard.getInstance().typeKey("Enter", 1);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
			
		}

	}
}