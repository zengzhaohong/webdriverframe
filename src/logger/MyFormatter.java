package logger;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter{

	@Override
	public String format(LogRecord record) {
		return "******"+ record.getLevel() 
		+ ":" + record.getMessage() +"******" + "\r\n";
	}
	
    public String getHead(Handler h) {
        return "MyLog Header" + "\r\n";
    }
    
    public String getTail(Handler h) {
        return "MyLog Tail";
    }
}
