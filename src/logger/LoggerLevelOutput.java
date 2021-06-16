package logger;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;

/**
 * 
 * @author 11158
 * 配置文件：***\jd\jre\lib\logging.properties
 * 日志级别的输出可以通过配置文件或者代码规定级别结合输出
 * 默认为INFO
 * 配置文件>Logger setlevel> hanlder setLevel
 */
public class LoggerLevelOutput {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger("MyLog");
		
//		log.setLevel(Level.WARNING);
//		log.setLevel(Level.SEVERE);
//		log.setLevel(Level.INFO);
		log.setLevel(Level.CONFIG);
//		log.setLevel(Level.ALL);
		
		log.severe("s");
		log.warning("w");
		log.info("info");
		log.config("config");
		log.fine("fine");
	}
}
