package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandlerDemo {

	public static void main(String[] args) throws SecurityException, IOException {
		
		Logger log2 = Logger.getLogger("MyLog2");
		
		FileHandler fileHandler = new FileHandler("D://test_FileHandlerDemo.log");
		fileHandler.setLevel(Level.INFO);
		log2.addHandler(fileHandler);
		log2.info("first info");
		log2.info("second info");
//		log2.warning("warning");
		log2.config("config");
		fileHandler.close();
	}

}
