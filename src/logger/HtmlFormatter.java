package logger;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class HtmlFormatter extends Formatter{

	private final String HTML_HEADER = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"
			+ "<html xmlns=\"http://www.w3.org/1999/xhtml\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">"
			+ "<META HTTP-EQUIV=\"CACHE-CONTROL\" CONTENT=\"NO-CACHE\">"
			+ "<META HTTP-EQUIV=\"PRAGMA\" CONTENT=\"NO-CACHE\">"
			+ "<link rel=\"stylesheet\" href=\"demo_report_style.css\"/>"
			+ "<html><head><title>测试报告</title></head>"
			+ "<body>"
			+ "<div class=\"page_title\"><center>"
			+ "<h1>测试报告</h1></center></div>"
			+ "<div class=\"statistics\"><table id=\"statistics_table\" class=\"sortable\" align=\"center\" border=\"0\"  style=\"width:100%;\"><tr>"
			+ "<th><b>序号</b></th>"
			+ "<th><b>用例描述</b></th>"
			+ "<th><b>期待结果</b></th>"
			+ "<th><b>实际结果</b></th>"
			+ "<th><b>执行时间</b></th>" + "<th><b>状态</b></th>" + "</tr>";
	
	private final String HTML_Tail="</table></PRE>" + "<br>&nbsp;开始时间   ："
				        + "<br>&nbsp;结束时间      ："
				        + "<br>&nbsp;运行时间      ："
					+ "<br>&nbsp;执行用例      ：" 
					+"<br>&nbsp;用例成功         ："
					+ "<br>&nbsp;<font color=Red>用例失败      ：" 
					+ "<br>&nbsp;成功率(%) ："
					+ "<br>&nbsp;<font color=Red>失败率(%) ："
					+ "<br><br>"
					+ "</BODY></HTML>";
	

	@Override
	public String format(LogRecord record) { 
		StringBuffer buf = new StringBuffer(1000);
		// Bold any levels >= WARNING
		buf.append("<div class=\"statistics\">");
		buf.append("<tr>");
		buf.append("<td>");
		buf.append("序号");
		buf.append("</td>");
		buf.append("<td>");
		// buf.append(calcDate(rec.getMillis()));
		// buf.append(' ');
		buf.append(record.getMessage());
		buf.append('\n');
		buf.append("</td>");
		buf.append("<td>");
		buf.append("期望结果");
		buf.append("</td>");
		buf.append("<td>");
		buf.append("实际结果");
		buf.append("</td>");
		buf.append("<td>");
		buf.append("");
		buf.append("</td>");
		buf.append("<td>");
		
			buf.append("<b>");
			buf.append("<font color=Green>");
			buf.append("结果");
			buf.append("</font>");
			buf.append("</b>");
		
		
		buf.append("</td>");
		buf.append("</tr>");
		buf.append("</div>\n");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//HtmlUtil.sleep(0.01);
	
		return buf.toString();
		
    } 
	
	@Override
	 public String getHead(Handler h) {
			return HTML_HEADER;
		    }
	
	@Override
     public String getTail(Handler h) {
			return HTML_Tail;
		    }

}
