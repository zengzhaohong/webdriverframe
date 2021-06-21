package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class TestMyFormatter {

	public static void main(String[] args) throws SecurityException, IOException {
		
		Logger log3 = Logger.getLogger("MyLog3");
		
		FileHandler fileHandler = new FileHandler("D://testMyFormatter.log");
		fileHandler.setFormatter(new MyFormatter());
		log3.addHandler(fileHandler);
		log3.info("info");
		log3.warning("warning");
		fileHandler.close();
	}

}
