package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotExp {

	public static void main(String[] args) {
		Robot robot;
		try {
			robot = new Robot();
			
			//����һ��ʱ����ӳ٣��Ա����Ҫ�������ļ���robot�ǹ�������ʲôλ�ã�ִ�д���ʱ��������ݾʹ�ʲôλ�ÿ�ʼ
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
