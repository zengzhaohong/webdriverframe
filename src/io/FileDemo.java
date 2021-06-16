package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author 11158
 * 创建一个文件为mylog_yyyy_MM_dd_HH_mm_ss.log，保存目录为当前工程\Result下
 *
 */
public class FileDemo {

	public static void main(String[] args) {
		//获取当前工程路径
		String base = System.getProperty("user.dir");
		System.out.println(base);
		
		//创建文件夹
		String folder_path = base + File.separator + "Result";
		File f = new File(folder_path);
		if(! f.exists()) {
			f.mkdir();
		}

		//创建文件
		String file_path = folder_path + File.separator + "mylog" +getCalcDate(System.currentTimeMillis()) + ".log";
		File t_log = new File(file_path);
		if (! t_log.exists()) {
			try {
				t_log.createNewFile();
				System.out.println("创建文件成功！");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("文件已存在！");
		}
	}
	//将时间格式处理为yyyy-MM-dd-HH-mm-ss格式
	public static String getCalcDate(long millisecs) {
		SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date resultdate = new Date(millisecs);
		return date_format.format(resultdate);
	}
}
