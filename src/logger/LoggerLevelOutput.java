package logger;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;

/**
 * 
 * @author 11158
 * �����ļ���***\jd\jre\lib\logging.properties
 * ��־������������ͨ�������ļ����ߴ���涨���������
 * Ĭ��ΪINFO
 * �����ļ�>Logger setlevel> hanlder setLevel
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
