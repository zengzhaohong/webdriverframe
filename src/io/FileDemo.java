package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author 11158
 * ����һ���ļ�Ϊmylog_yyyy_MM_dd_HH_mm_ss.log������Ŀ¼Ϊ��ǰ����\Result��
 *
 */
public class FileDemo {

	public static void main(String[] args) {
		//��ȡ��ǰ����·��
		String base = System.getProperty("user.dir");
		System.out.println(base);
		
		//�����ļ���
		String folder_path = base + File.separator + "Result";
		File f = new File(folder_path);
		if(! f.exists()) {
			f.mkdir();
		}

		//�����ļ�
		String file_path = folder_path + File.separator + "mylog" +getCalcDate(System.currentTimeMillis()) + ".log";
		File t_log = new File(file_path);
		if (! t_log.exists()) {
			try {
				t_log.createNewFile();
				System.out.println("�����ļ��ɹ���");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("�ļ��Ѵ��ڣ�");
		}
	}
	//��ʱ���ʽ����Ϊyyyy-MM-dd-HH-mm-ss��ʽ
	public static String getCalcDate(long millisecs) {
		SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date resultdate = new Date(millisecs);
		return date_format.format(resultdate);
	}
}
